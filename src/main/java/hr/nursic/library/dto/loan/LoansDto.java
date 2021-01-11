package hr.nursic.library.dto.loan;

import java.util.ArrayList;
import java.util.List;

import hr.nursic.library.model.Loan;

public class LoansDto {
	private List<LoanDto> loans = new ArrayList<>();

	public static LoansDto fromLoanList(List<Loan> loanList) {
		List<LoanDto> loans = new ArrayList<>();
		for (Loan l : loanList) {
			loans.add(LoanDto.fromLoan(l));
		}
		return new LoansDto(loans);
	}

	public LoansDto(List<LoanDto> loans) {
		super();
		this.loans = loans;
	}

	public List<LoanDto> getLoans() {
		return loans;
	}

	public void setLoans(List<LoanDto> loans) {
		this.loans = loans;
	}

	
	
}
