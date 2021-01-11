package hr.nursic.library.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name = "loans")
public class Loan extends AbstractEntity {

	@Column(name = "loan_date")
	private Date loanDate;
	@Column(name = "expected_return_date")
	private Date expectedReturnDate;
	@Column(name = "actual_return_date")
	@Nullable
	private Date actualReturnDate;
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	public Loan() {
		super();
	}

	public Loan(Date loanDate, Date expectedReturnDate, Date actualReturnDate) {
		super();
		this.loanDate = loanDate;
		this.expectedReturnDate = expectedReturnDate;
		this.actualReturnDate = actualReturnDate;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	public Date getExpectedReturnDate() {
		return expectedReturnDate;
	}

	public void setExpectedReturnDate(Date expectedReturnDate) {
		this.expectedReturnDate = expectedReturnDate;
	}

	public Date getActualReturnDate() {
		return actualReturnDate;
	}

	public void setActualReturnDate(Date actualReturnDate) {
		this.actualReturnDate = actualReturnDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Loan [id=" + getId() + ", loanDate=" + loanDate + ", expectedReturnDate=" + expectedReturnDate
				+ ", actualReturnDate=" + actualReturnDate + "]";
	}

}
