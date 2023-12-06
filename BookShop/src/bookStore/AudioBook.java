package bookStore;
import java.util.Date;

public class AudioBook extends Book {

	private String narrator;

	public AudioBook(String isbn, String title, String author, Date publishDate, int quantity, String narrator) {
		super(isbn, title, author, publishDate, quantity);
		// TODO Auto-generated constructor stub
	}

	public String getNarrator() {
		return narrator;
	}

}
