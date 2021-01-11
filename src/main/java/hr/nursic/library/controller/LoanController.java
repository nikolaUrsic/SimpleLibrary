package hr.nursic.library.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hr.nursic.library.dto.loan.CreateLoanByBookCopyRequest;
import hr.nursic.library.dto.loan.CreateLoanByBookRequest;
import hr.nursic.library.dto.loan.LoanDto;
import hr.nursic.library.service.LoanService;

@RestController
@RequestMapping("/api/loans")
public class LoanController extends AbstractController {

	@Autowired
	private LoanService loanService;
	
	@PostMapping("")
	public ResponseEntity<LoanDto> createLoan(@Valid @RequestBody CreateLoanByBookRequest createLoanRequest) {
		return new ResponseEntity<LoanDto>(LoanDto.fromLoan(loanService.createLoan(createLoanRequest.getUserId(), createLoanRequest.getBookId())), HttpStatus.CREATED);
	}
	
	@PostMapping("{bookCopyId}")
	public ResponseEntity<LoanDto> createLoanWithBookCopyId(@PathVariable(value = "bookCopyId") Long bookCopyId, @Valid @RequestBody CreateLoanByBookCopyRequest createLoanRequest) {
		return new ResponseEntity<LoanDto>(LoanDto.fromLoan(loanService.createLoanWithBookCopyId(createLoanRequest.getUserId(), bookCopyId)), HttpStatus.CREATED);
	}

	@PutMapping("/{loanId}")
	public ResponseEntity<LoanDto> returnLoan(@PathVariable(value = "loanId") Long loanId) {
		return ResponseEntity.ok(LoanDto.fromLoan(loanService.returnBook(loanId)));
	}

}
