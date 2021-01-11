package hr.nursic.library.dto.loan;

public class CreateLoanByBookCopyRequest {
	private long userId;

	public CreateLoanByBookCopyRequest(long userId) {
		super();
		this.userId = userId;
	}
	
	public CreateLoanByBookCopyRequest() {
		super();
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	};
}
