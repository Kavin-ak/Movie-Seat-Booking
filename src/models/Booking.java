package models;

import java.util.Date;
import java.util.List;

public class Booking {
    private Movie movie;
    private Theater theater;
    private List<String> seatsBooked;
    private Date bookingTime;
    private String customerName;
    private double totalPrice;
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public List<String> getSeatsBooked() {
		return seatsBooked;
	}
	public void setSeatsBooked(List<String> seatsBooked) {
		this.seatsBooked = seatsBooked;
	}
	public Date getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(Date bookingTime) {
		this.bookingTime = bookingTime;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Theater getTheater() {
		return theater;
	}
	public void setTheater(Theater theater) {
		this.theater = theater;
	}


}
