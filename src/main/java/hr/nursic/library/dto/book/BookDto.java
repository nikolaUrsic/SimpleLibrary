package hr.nursic.library.dto.book;

import hr.nursic.library.model.Book;

public class BookDto {

	private long id;
	private String title;
	private String author;
	private int yearOfPublication;

	public static BookDto fromBook(Book book) {
		return new BookDto(book.getId(), book.getTitle(), book.getAuthor(), book.getYearOfPublication());
	}

	public BookDto(long id, String title, String author, int yearOfPublication) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.yearOfPublication = yearOfPublication;
	}

	public BookDto() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

}
