package hr.nursic.library.dto.book;

import java.util.ArrayList;
import java.util.List;

import hr.nursic.library.model.BookCopy;

public class BookCopiesDto {

	private List<BookCopyDto> bookCopies = new ArrayList<>();

	public static BookCopiesDto fromBookCopyList(List<BookCopy> bookCopyList) {
		List<BookCopyDto> bookCopies = new ArrayList<>();
		for (BookCopy b : bookCopyList) {
			bookCopies.add(BookCopyDto.fromBookCopy(b));
		}
		return new BookCopiesDto(bookCopies);
	}

	public BookCopiesDto(List<BookCopyDto> bookCopies) {
		super();
		this.bookCopies = bookCopies;
	}

	public List<BookCopyDto> getBookCopies() {
		return bookCopies;
	}

	public void setBookCopies(List<BookCopyDto> bookCopies) {
		this.bookCopies = bookCopies;
	}

}
