package app;

import java.util.List;

import models.Movie;
import models.Theater;
import services.BookingService;
import services.MovieService;

public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie();
        Movie movie2 = new Movie("The Dark Knight", 152, "Action", "Christopher Nolan", 
            List.of("Christian Bale", "Heath Ledger", "Aaron Eckhart"), 9.0);

        int[][] seats = new int[10][10];
        Theater theater = new Theater("Cineplex", seats);

        MovieService movieService = new MovieService();
        BookingService bookingService = new BookingService();
        movieService.addMovie(movie1);
        movieService.addMovie(movie2);


        bookingService.makeBooking(movie1, theater, List.of("A1", "A2", "A3"), "John Doe");
        List<Movie> customerBookings = bookingService.getBookingDetails("John Doe");
        for (Movie movie : customerBookings) {
            System.out.println("Customer John Doe has booked: " + movie.getTitle());
        }
    }
}
