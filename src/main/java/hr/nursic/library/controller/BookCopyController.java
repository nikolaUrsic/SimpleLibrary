package hr.nursic.library.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hr.nursic.library.dto.book.BookCopyDetailsDto;
import hr.nursic.library.dto.book.BookCopyDto;
import hr.nursic.library.model.BookCopy;
import hr.nursic.library.service.BookCopyService;

@RestController
@RequestMapping("/api/copies")
public class BookCopyController extends AbstractController {

	@Autowired
	private BookCopyService bookCopyService;

	@GetMapping("/{bookCopyId}")
	public ResponseEntity<BookCopyDetailsDto> getBookCopy(@PathVariable(value = "bookCopyId") Long bookCopyId) {
		return ResponseEntity.ok(BookCopyDetailsDto.fromBookCopy(bookCopyService.findById(bookCopyId)));
	}

	@PutMapping("/{bookCopyId}")
	public ResponseEntity<BookCopyDto> updateBookCopy(@PathVariable(value = "bookCopyId") Long bookCopyId,
			@Valid @RequestBody BookCopy bookCopy) {
		return ResponseEntity.ok(BookCopyDto.fromBookCopy(bookCopyService.update(bookCopyId, bookCopy)));
	}

	@DeleteMapping("/{bookCopyId}")
	public ResponseEntity<?> deleteBookCopy(@PathVariable(value = "bookCopyId") Long bookCopyId) {
		bookCopyService.delete(bookCopyId);
		return ResponseEntity.noContent().build();
	}

}
