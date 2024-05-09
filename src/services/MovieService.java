package services;

import java.util.ArrayList;
import java.util.List;
import models.Movie;

public class MovieService {
    
    private List<Movie> movies;

    public MovieService() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }

    public List<Movie> getAllMovies() {
        return movies;
    }

    public List<Movie> getMoviesByGenre(String genre) {
        List<Movie> genreMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(genre)) {
                genreMovies.add(movie);
            }
        }
        return genreMovies;
    }

    public List<Movie> getMoviesByDirector(String director) {
        List<Movie> directorMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getDirector().equalsIgnoreCase(director)) {
                directorMovies.add(movie);
            }
        }
        return directorMovies;
    }

    public List<Movie> getMoviesByCastMember(String castMember) {
        List<Movie> castMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getCast().contains(castMember)) {
                castMovies.add(movie);
            }
        }
        return castMovies;
    }
}
