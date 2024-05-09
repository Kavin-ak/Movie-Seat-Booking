package services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import models.Booking;

public class BookingService {
    
    private List<Booking> bookings;

    public BookingService() {
        this.bookings = new ArrayList<>();
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public void removeBooking(Booking booking) {
        bookings.remove(booking);
    }

    public List<Booking> getAllBookings() {
        return bookings;
    }

    public List<Booking> getBookingsByCustomer(String customerName) {
        List<Booking> customerBookings = new ArrayList<>();
        for (Booking booking : bookings) {
            if (booking.getCustomerName().equals(customerName)) {
                customerBookings.add(booking);
            }
        }
        return customerBookings;
    }

    public List<Booking> getBookingsByMovie(String movieTitle) {
        List<Booking> movieBookings = new ArrayList<>();
        for (Booking booking : bookings) {
            if (booking.getMovie().getTitle().equals(movieTitle)) {
                movieBookings.add(booking);
            }
        }
        return movieBookings;
    }

    public List<Booking> getBookingsByTheater(String theaterName) {
        List<Booking> theaterBookings = new ArrayList<>();
        for (Booking booking : bookings) {
            if (booking.getTheater().getName().equals(theaterName)) {
                theaterBookings.add(booking);
            }
        }
        return theaterBookings;
    }

    public List<Booking> getBookingsByDate(Date date) {
        List<Booking> dateBookings = new ArrayList<>();
        for (Booking booking : bookings) {
            if (booking.getBookingTime().equals(date)) {
                dateBookings.add(booking);
            }
        }
        return dateBookings;
    }

}
