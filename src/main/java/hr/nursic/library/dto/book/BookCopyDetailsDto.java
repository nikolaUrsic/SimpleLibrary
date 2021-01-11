package hr.nursic.library.dto.book;

import java.util.HashSet;
import java.util.Set;

import hr.nursic.library.dto.loan.LoanDto;
import hr.nursic.library.model.Book;
import hr.nursic.library.model.BookCopy;
import hr.nursic.library.model.Loan;

public class BookCopyDetailsDto {

	private long id;
	private boolean available;
	private BookDto book;
	private Set<LoanDto> loans = new HashSet<>();
	
	public static BookCopyDetailsDto fromBookCopy(BookCopy bookCopy) {
		return new BookCopyDetailsDto(bookCopy.getId(), bookCopy.isAvailable(), bookCopy.getBook(), bookCopy.getLoans());
	}
	
	public BookCopyDetailsDto(long id, boolean available, Book book, Set<Loan> loans) {
		super();
		this.id = id;
		this.available = available;
		this.book = BookDto.fromBook(book);
		for(Loan l : loans) {
			this.loans.add(LoanDto.fromLoan(l));
		}
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public BookDto getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = BookDto.fromBook(book);
	}
	public Set<LoanDto> getLoans() {
		return loans;
	}
	public void setLoans(Set<Loan> loans) {
		for(Loan l : loans) {
			this.loans.add(LoanDto.fromLoan(l));
		}
	}
	
	
	
	
}
