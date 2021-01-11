package hr.nursic.library.service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import hr.nursic.library.exception.ResourceNotAvailableException;
import hr.nursic.library.exception.ResourceNotFoundException;
import hr.nursic.library.model.Book;
import hr.nursic.library.model.BookCopy;
import hr.nursic.library.model.Loan;
import hr.nursic.library.model.User;
import hr.nursic.library.repository.LoanRepository;

@Service
public class LoanService {
	
	@Value( "${loan.daysToReturn}" )
	private int daysToReturn;

	@Autowired
	private LoanRepository loanRepository;

	@Autowired
	private BookCopyService bookCopyService;

	@Autowired
	private UserService userService;

	@Autowired
	private BookService bookService;

	public Loan createLoan(long userId, long bookId) {
		User user = userService.findById(userId);
		Book book = bookService.findById(bookId);
		BookCopy bookCopy = bookCopyService.findByAvailableAndBookId(true, book.getId());
		Loan loan = new Loan(convertToDateViaInstant(LocalDate.now()),
				convertToDateViaInstant(LocalDate.now().plusDays(daysToReturn)), null); 
		loan.setUser(user);
		loanRepository.save(loan);
		bookCopy.setAvailable(false);
		bookCopy.getLoans().add(loan);
		bookCopyService.update(bookCopy.getId(), bookCopy);
		return loan;
	}

	public Loan returnBook(Long loanId) {
		Loan loan = this.findById(loanId);
		if (null != loan.getActualReturnDate()) {
			throw new ResourceNotAvailableException(
					"BookCopy assoisated with loan with id " + loanId + " has been already returned");
		}
		loan.setActualReturnDate(convertToDateViaInstant(LocalDate.now()));
		this.update(loan);
		Long bookCopyId = loanRepository.findBookCopyIdById(loanId);
		BookCopy bookCopy = bookCopyService.findById(bookCopyId);
		bookCopy.setAvailable(true);
		bookCopyService.update(bookCopy.getId(), bookCopy);
		return loan;
	}

	public Date convertToDateViaInstant(LocalDate dateToConvert) {
		return java.util.Date.from(dateToConvert.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
	}

	public Loan createLoanWithBookCopyId(long userId, Long bookCopyId) {
		User user = userService.findById(userId);
		BookCopy bookCopy = bookCopyService.findById(bookCopyId);
		if (!bookCopy.isAvailable()) {
			throw new ResourceNotAvailableException("BookCopy with id " + bookCopyId + " is not available");
		}
		Loan loan = new Loan(convertToDateViaInstant(LocalDate.now()),
				convertToDateViaInstant(LocalDate.now().plusDays(daysToReturn)), null); 
		loan.setUser(user);
		loanRepository.save(loan);
		bookCopy.setAvailable(false);
		bookCopy.getLoans().add(loan);
		bookCopyService.update(bookCopy.getId(), bookCopy);
		return loan;
	}

	public Loan findById(long id) {
		return loanRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Loan with id " + id + " not found"));
	}

	private void update(Loan loanDetails) {
		Loan loan = loanRepository.findById(loanDetails.getId())
				.orElseThrow(() -> new ResourceNotFoundException("Loan with id " + loanDetails.getId() + " not found"));
		loan.setActualReturnDate(loanDetails.getActualReturnDate());
		// ostali podatci se ne bi trebali mijenjati
		loanRepository.save(loan);
	}

	public List<Loan> findByUserId(long userId) {
		return loanRepository.findByUserId(userId);
	}

	public boolean checkDidUserReturAllBook(long userId) {
		if (null != loanRepository.findFirstByActualReturnDateNotNullAndUserId(userId)) {
			return true;
		}
		return false;
	}
	
	public void deleteById(long loanId) {
		if (!loanRepository.existsById(loanId)) {
			throw new ResourceNotFoundException("Loan with id "+loanId+" not found");
		}
		loanRepository.deleteById(loanId);
	}
	
	public List<Loan> findAll(){
		return loanRepository.findAll();
	}

}
