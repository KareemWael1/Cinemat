import java.util.ArrayList;

public class CinemaOwner extends Person {
    static ArrayList<Cinema> cinemas = new ArrayList<>();
    static ArrayList<Movie> movies = new ArrayList<>();

    public void addCinema(String name, int phone, int seats, double price, String location, double openTime, double closeTime) {
        Cinema cinema = new Cinema(name, phone, seats, price, location, openTime, closeTime);
        cinemas.add(cinema);
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }
}