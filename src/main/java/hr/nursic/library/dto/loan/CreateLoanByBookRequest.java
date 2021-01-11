package hr.nursic.library.dto.loan;

public class CreateLoanByBookRequest {

	private long bookId;
	private long userId;

	public CreateLoanByBookRequest(long bookId, long userId) {
		super();
		this.bookId = bookId;
		this.userId = userId;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	};

}
