package hr.nursic.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book extends AbstractEntity{

	@Column(name = "title")
	private String title;
	@Column(name = "author")
	private String author;
	@Column(name = "yearOfPublication")
	private int yearOfPublication;

	public Book() {
		super();
	}

	public Book(String title, String author, int yearOfPublication) {
		super();
		this.title = title;
		this.author = author;
		this.yearOfPublication = yearOfPublication;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	@Override
	public String toString() {
		return "Book [id=" + getId() + ", title=" + title + ", author=" + author + ", yearOfPublication=" + yearOfPublication
				+ "]";
	}

}
