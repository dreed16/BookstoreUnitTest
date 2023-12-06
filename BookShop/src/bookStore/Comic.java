package bookStore;
import java.util.Date;

public class Comic extends Book {

	private String illustrator;

	public Comic(String isbn, String title, String author, Date publishDate, int quantity, String illustrator) {
		super(isbn, title, author, publishDate, quantity);
		// TODO Auto-generated constructor stub
	}

	public String getIllustrator() {
		return illustrator;
	}

}
