package bookStore;
import java.util.Date;
import java.util.Random;

public class Reservation {
	
	Book book;
	Customer customer;
	Date orderDate;
	Date availabilityDate;
	
	public Reservation(Book book, Customer customer, Date orderDate, Date availabilityDate) {
		super();
		this.book = book;
		this.customer = customer;
		this.orderDate = orderDate;
		this.availabilityDate = availabilityDate;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getAvailabilityDate() {
		return availabilityDate;
	}
	public void setAvailabilityDate(Date availabilityDate) {
		this.availabilityDate = availabilityDate;
	}
	public Book getBook() {
		return book;
	}
	public Customer getCustomer() {
		return customer;
	}
	
	public void generateReservationNumber()
	{
		
	}
	
		//Reservation
}
