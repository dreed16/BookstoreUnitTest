package bookStore;
import java.util.Date;

public class Book {

	private String isbn;
	private String title;
	private String author;
	private Date publishDate;
	private Date restockDate;
	private int quantity;

	public Book(String isbn, String title, String author, Date publishDate, int quantity) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publishDate = publishDate;
		this.quantity = quantity;
	}

	public Date getRestockDate() {
		return restockDate;
	}

	public void setRestockDate(Date restockDate) {
		this.restockDate = restockDate;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void increaseQuantity(int restock) {
		this.quantity += restock;
	}

	public void decreaseQuantity() {
		this.quantity -= 1;

	}

}