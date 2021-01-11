package hr.nursic.library.dto.book;

import hr.nursic.library.model.BookCopy;

public class BookCopyDto {

	private long id;
	private boolean available;

	public static BookCopyDto fromBookCopy(BookCopy bookCopy) {
		return new BookCopyDto(bookCopy.getId(), bookCopy.isAvailable());
	}

	public BookCopyDto(long id,  boolean available) {
		super();
		this.id = id;
		this.available = available;
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

}
