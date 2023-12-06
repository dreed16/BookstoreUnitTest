package test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import bookStore.AudioBook;

public class AudioBookTest {
	@Test
	public void testGetPublishDate()
	{
		AudioBook audioBook = new AudioBook("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10, "GenericNarrator");
		assertEquals(new Date(2000, 0, 01), audioBook.getPublishDate());
	}
	
	@Test
	public void testGetIsbm()
	{
		AudioBook audioBook = new AudioBook("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10, "GenericNarrator");
		assertEquals("0001", audioBook.getIsbn());
	}
	
	@Test
	public void testGetTitle()
	{
		AudioBook audioBook = new AudioBook("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10, "GenericNarrator");
		assertEquals("GenericTitle", audioBook.getTitle());
	}
	
	@Test
	public void testGetAuthor()
	{
		AudioBook audioBook = new AudioBook("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10, "GenericNarrator");
		assertEquals("GenericAuthor", audioBook.getAuthor());
	}
	
	@Test
	public void testGetSetPublishdate()
	{
		AudioBook audioBook = new AudioBook("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10, "GenericNarrator");
		audioBook.setRestockDate(new Date(2000, 0, 01));
		assertEquals(new Date(2000,0,01), audioBook.getRestockDate());
	}
	
	@Test
	public void testGetQuantity()
	{
		AudioBook audioBook = new AudioBook("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10, "GenericNarrator");
		assertEquals(10, audioBook.getQuantity());
	}
	
	@Test
	public void testIncreaseQuantity()
	{
		AudioBook audioBook = new AudioBook("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10, "GenericNarrator");
		audioBook.increaseQuantity(1);
		assertEquals(11, audioBook.getQuantity());
	}
	
	@Test
	public void testDecreaseQuantity()
	{
		AudioBook audioBook = new AudioBook("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10, "GenericNarrator");
		audioBook.decreaseQuantity();
		assertEquals(9, audioBook.getQuantity());
	}
	
	@Test
	public void testGetNarrator()
	{
		AudioBook audioBook = new AudioBook("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10, "GenericNarrator");
		assertEquals("GenericNarrator", audioBook.getNarrator());
	}
}
