package hr.nursic.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.nursic.library.exception.ResourceNotFoundException;
import hr.nursic.library.model.Book;
import hr.nursic.library.model.BookCopy;
import hr.nursic.library.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private BookCopyService bookCopyService;
	
	public List<Book> findAll(){
		return bookRepository.findAll();
	}
	
	public Book findById(long id){
		return bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Book with id "+id+" not found"));
	}
	
	public Book save(Book book) {
		return bookRepository.save(book);
	}
	
	public Book update(long bookId, Book bookDetails) {		
		Book book = bookRepository.findById(bookId)
				.orElseThrow(() -> new ResourceNotFoundException("Book with id "+bookId+" not found"));
		book.setTitle(bookDetails.getTitle());
		book.setAuthor(bookDetails.getAuthor());
		book.setYearOfPublication(bookDetails.getYearOfPublication());
		return bookRepository.save(book);
	}	
	
	public List<BookCopy> findAllBookCopies(long bookId){
		if (!bookRepository.existsById(bookId)) {
			throw new ResourceNotFoundException("Book with id "+bookId+" not found");
		}
		return bookCopyService.findByBookId(bookId);
	}
	
	public BookCopy addBookCopyToBook(long bookId, BookCopy bookCopy) {
		return bookRepository.findById(bookId).map(book -> {
			bookCopy.setBook(book);
			return bookCopyService.save(bookCopy);
		}).orElseThrow(() -> new ResourceNotFoundException("BookId " + bookId + " not found"));
		
	}
	
}
