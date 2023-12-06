package test;
import static org.junit.Assert.*;

import java.util.Date;
import bookStore.*;

import org.junit.Test;

/*
 * Test file for the book class.
 * 
 * tests all getters, setters, and the increaseQuantity function and the decreaseQuantity funcion
 */
public class BookTest {
	@Test
	public void testGetPublishDate()
	{
		Book book = new Book("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10);
		assertEquals(new Date(2000, 0, 01), book.getPublishDate());
	}
	
	@Test
	public void testGetIsbm()
	{
		Book book = new Book("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10);
		assertEquals("0001", book.getIsbn());
	}
	
	@Test
	public void testGetTitle()
	{
		Book book = new Book("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10);
		assertEquals("GenericTitle", book.getTitle());
	}
	
	@Test
	public void testGetAuthor()
	{
		Book book = new Book("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10);
		assertEquals("GenericAuthor", book.getAuthor());
	}
	
	@Test
	public void testGetSetPublishdate()
	{
		Book book = new Book("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10);
		book.setRestockDate(new Date(2000, 0, 01));
		assertEquals(new Date(2000,0,01), book.getRestockDate());
	}
	
	@Test
	public void testGetQuantity()
	{
		Book book = new Book("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10);
		assertEquals(10, book.getQuantity());
	}
	
	@Test
	public void testIncreaseQuantity()
	{
		Book book = new Book("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10);
		book.increaseQuantity(1);
		assertEquals(11, book.getQuantity());
	}
	
	@Test
	public void testDecreaseQuantity()
	{
		Book book = new Book("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10);
		book.decreaseQuantity();
		assertEquals(9, book.getQuantity());
	}
}