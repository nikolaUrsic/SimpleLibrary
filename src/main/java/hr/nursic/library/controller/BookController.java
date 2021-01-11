package hr.nursic.library.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hr.nursic.library.dto.book.BookCopiesDto;
import hr.nursic.library.dto.book.BookCopyDto;
import hr.nursic.library.dto.book.BookDto;
import hr.nursic.library.dto.book.BooksDto;
import hr.nursic.library.model.Book;
import hr.nursic.library.model.BookCopy;
import hr.nursic.library.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController extends AbstractController {

	@Autowired
	private BookService bookService;

	@GetMapping("")
	public ResponseEntity<BooksDto> getAllBooks() {
		return ResponseEntity.ok(BooksDto.fromBookList(bookService.findAll()));
	}

	@GetMapping("/{id}")
	public ResponseEntity<BookDto> getBookById(@PathVariable(value = "id") Long bookId) {
		return ResponseEntity.ok(BookDto.fromBook(bookService.findById(bookId)));
	}

	@PostMapping("")
	public ResponseEntity<BookDto> createBook(@RequestBody Book book) {
		return new ResponseEntity<BookDto>(BookDto.fromBook(bookService.save(book)), HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<BookDto> updateBook(@PathVariable(value = "id") Long bookId,
			@Valid @RequestBody Book bookDetails) {
		return ResponseEntity.ok(BookDto.fromBook(bookService.update(bookId, bookDetails)));
	}

	@GetMapping("/{bookId}/copies")
	public ResponseEntity<BookCopiesDto> getAllBookCopiesByBookId(@PathVariable(value = "bookId") Long bookId,
			Pageable pageable) {
		return ResponseEntity.ok(BookCopiesDto.fromBookCopyList(bookService.findAllBookCopies(bookId)));
	}

	@PostMapping("/{bookId}/copies")
	public ResponseEntity<BookCopyDto> createBookCopy(@PathVariable(value = "bookId") Long bookId,
			@Valid @RequestBody BookCopy bookCopy) {
		return new ResponseEntity<BookCopyDto>(
				BookCopyDto.fromBookCopy(bookService.addBookCopyToBook(bookId, bookCopy)), HttpStatus.CREATED);
	}

}
