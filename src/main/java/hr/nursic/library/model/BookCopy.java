package hr.nursic.library.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book_copies")
public class BookCopy extends AbstractEntity{

	@ManyToOne
	@JoinColumn(name = "book_id", nullable = false)
	private Book book;
	@Column(name = "available")
	private boolean available;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "book_copy_id")
	private Set<Loan> loans = new HashSet<>();

	public BookCopy() {
		super();
	}

	public BookCopy(Book book, boolean available) {
		super();
		this.book = book;
		this.available = available;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Set<Loan> getLoans() {
		return loans;
	}

	public void setLoans(Set<Loan> loans) {
		this.loans = loans;
	}

	@Override
	public String toString() {
		return "BookCopy [id=" + getId() + ", book=" + book + ", available=" + available + ", loans=" + loans + "]";
	}

	

}
