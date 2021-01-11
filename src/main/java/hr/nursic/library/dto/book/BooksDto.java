package hr.nursic.library.dto.book;

import java.util.ArrayList;
import java.util.List;

import hr.nursic.library.model.Book;

public class BooksDto {

	private List<BookDto> books = new ArrayList<>();

	public static BooksDto fromBookList(List<Book> bookList) {
		List<BookDto> books = new ArrayList<>();
		for (Book b : bookList) {
			books.add(BookDto.fromBook(b));
		}
		return new BooksDto(books);
	}

	public BooksDto(List<BookDto> books) {
		super();
		this.books = books;
	}

	public List<BookDto> getBooks() {
		return books;
	}

	public void setBooks(List<BookDto> books) {
		this.books = books;
	}

}
