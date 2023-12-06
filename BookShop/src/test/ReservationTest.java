package test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import bookStore.*;

public class ReservationTest {
	@Test
	public void testGetOrderDate()
	{
		Book book = new Book("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10);
		Customer customer = new Customer();
		Reservation reservation = new Reservation(book, customer, new Date(2000, 0, 01), new Date(2000, 0, 01));
		
		assertEquals(new Date(2000, 0, 01), reservation.getOrderDate());
	}
	
	@Test
	public void testSetOrderDate()
	{
		Book book = new Book("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10);
		Customer customer = new Customer();
		Reservation reservation = new Reservation(book, customer, new Date(2000, 0, 01), new Date(2000, 0, 01));
		
		reservation.setOrderDate(new Date(2000, 1, 01));
		
		assertEquals(new Date(2000, 1, 01), reservation.getOrderDate());
	}
	
	@Test
	public void testGetAvailabilityDate()
	{
		Book book = new Book("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10);
		Customer customer = new Customer();
		Reservation reservation = new Reservation(book, customer, new Date(2000, 0, 01), new Date(2000, 0, 01));
		
		assertEquals(new Date(2000, 0, 01), reservation.getAvailabilityDate());
	}
	
	@Test
	public void testSetAvailabilityDate()
	{
		Book book = new Book("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10);
		Customer customer = new Customer();
		Reservation reservation = new Reservation(book, customer, new Date(2000, 0, 01), new Date(2000, 0, 01));
		
		reservation.setAvailabilityDate(new Date(2000, 1, 01));
		
		assertEquals(new Date(2000, 1, 01), reservation.getAvailabilityDate());
	}
	
	@Test
	public void testGetBook()
	{
		Book book = new Book("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10);
		Customer customer = new Customer();
		Reservation reservation = new Reservation(book, customer, new Date(2000, 0, 01), new Date(2000, 0, 01));
		
		assertEquals(reservation.getBook(), book);
	}
	
	@Test
	public void testGetCustomer()
	{
		Book book = new Book("0001", "GenericTitle", "GenericAuthor", new Date(2000, 0, 01), 10);
		Customer customer = new Customer();
		Reservation reservation = new Reservation(book, customer, new Date(2000, 0, 01), new Date(2000, 0, 01));
		
		assertEquals(reservation.getBook(), book);
	}
}
