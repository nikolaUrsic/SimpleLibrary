package hr.nursic.library.dto.loan;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import hr.nursic.library.dto.user.UserDto;
import hr.nursic.library.model.Loan;
import hr.nursic.library.model.User;

public class LoanDto {

	private long id;
	private LocalDate loanDate;
	private LocalDate expectedReturnDate;
	private LocalDate actualReturnDate;
	private UserDto user;

	public static LoanDto fromLoan(Loan loan) {
		return new LoanDto(loan.getId(), loan.getLoanDate(), loan.getExpectedReturnDate(), loan.getActualReturnDate(),
				loan.getUser());
	}

	public LoanDto(long id, Date loanDate, Date expectedReturnDate, Date actualReturnDate, User user) {
		super();
		this.id = id;
		this.loanDate = loanDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		this.expectedReturnDate = expectedReturnDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		if (null != actualReturnDate) {
			this.actualReturnDate = actualReturnDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		}
		this.user = UserDto.fromUser(user);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	public LocalDate getExpectedReturnDate() {
		return expectedReturnDate;
	}

	public void setExpectedReturnDate(Date expectedReturnDate) {
		this.expectedReturnDate = expectedReturnDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	public LocalDate getActualReturnDate() {
		return actualReturnDate;
	}

	public void setActualReturnDate(Date actualReturnDate) {
		this.actualReturnDate = actualReturnDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = UserDto.fromUser(user);
	}

}
