package hr.nursic.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.nursic.library.exception.ResourceNotAvailableException;
import hr.nursic.library.exception.ResourceNotFoundException;
import hr.nursic.library.model.BookCopy;
import hr.nursic.library.model.Loan;
import hr.nursic.library.repository.BookCopyRepository;

@Service
public class BookCopyService {
	
	@Autowired
	private BookCopyRepository bookCopyRepository;
	
	@Autowired
	private LoanService loanService;
	
	public BookCopy update(long bookCopyId, BookCopy bookCopyDetails) {
		BookCopy bookCopy = bookCopyRepository.findById(bookCopyId)
				.orElseThrow(() -> new ResourceNotFoundException("BookCopy with id "+bookCopyId+" not found"));
		bookCopy.setAvailable(bookCopyDetails.isAvailable());
		return bookCopyRepository.save(bookCopy);
	}
	
	public void delete(long bookCopyId) {
		BookCopy bookCopy = bookCopyRepository.findById(bookCopyId)
				.orElseThrow(() -> new ResourceNotFoundException("BookCopy with id "+bookCopyId+" not found"));
		if(!bookCopy.isAvailable()) {
			throw new ResourceNotAvailableException("BookCopy with id "+bookCopyId+" is not available, so it can not be deleted");
		}
		for(Loan l : bookCopy.getLoans()) {
			loanService.deleteById(l.getId());
		}
		bookCopyRepository.deleteById(bookCopyId);
	}
	
	public BookCopy findByAvailableAndBookId(boolean available, Long bookId){
		return bookCopyRepository.findFirstByAvailableAndBookId(available, bookId).orElseThrow(() -> new ResourceNotAvailableException("There are no available books with id "+bookId));
	}

	public BookCopy findById(Long bookCopyId) {
		return bookCopyRepository.findById(bookCopyId).orElseThrow(() -> new ResourceNotFoundException("BookCopy with id "+bookCopyId+" not found"));
	}

	public List<BookCopy> findByBookId(long bookId) {
		return bookCopyRepository.findByBookId(bookId);
	}

	public BookCopy save(BookCopy bookCopy) {
		return bookCopyRepository.save(bookCopy);
	}

}
