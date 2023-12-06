package test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import bookStore.*;

public class ComicTest {
	
	@Test
	public void testGetPublishDate()
	{
		Comic comic = new Comic("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10, "GenericIllustrator");
		assertEquals(new Date(2000, 0, 01), comic.getPublishDate());
	}
	
	@Test
	public void testGetIsbm()
	{
		Comic comic = new Comic("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10, "GenericIllustrator");
		assertEquals("0001", comic.getIsbn());
	}
	
	@Test
	public void testGetTitle()
	{
		Comic comic = new Comic("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10, "GenericIllustrator");
		assertEquals("GenericTitle", comic.getTitle());
	}
	
	@Test
	public void testGetAuthor()
	{
		Comic comic = new Comic("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10, "GenericIllustrator");
		assertEquals("GenericAuthor", comic.getAuthor());
	}
	
	@Test
	public void testGetSetPublishdate()
	{
		Comic comic = new Comic("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10, "GenericIllustrator");
		comic.setRestockDate(new Date(2000, 0, 01));
		assertEquals(new Date(2000,0,01), comic.getRestockDate());
	}
	
	@Test
	public void testGetQuantity()
	{
		Comic comic = new Comic("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10, "GenericIllustrator");
		assertEquals(10, comic.getQuantity());
	}
	
	@Test
	public void testIncreaseQuantity()
	{
		Comic comic = new Comic("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10, "GenericIllustrator");
		comic.increaseQuantity(1);
		assertEquals(11, comic.getQuantity());
	}
	
	@Test
	public void testDecreaseQuantity()
	{
		Comic comic = new Comic("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10, "GenericIllustrator");
		comic.decreaseQuantity();
		assertEquals(9, comic.getQuantity());
	}
	
	@Test
	public void testGetIllustrator() {
		Comic comic = new Comic("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10, "GenericIllustrator");
		assertEquals("GenericIllustrator", comic.getIllustrator());
	}
}
