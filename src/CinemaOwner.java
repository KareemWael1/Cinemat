import java.util.ArrayList;

public class CinemaOwner extends Person {
    static ArrayList<Cinema> cinemas = new ArrayList<>();
    static ArrayList<Movie> movies = new ArrayList<>();

    public CinemaOwner(int age, String name, String email) {
        super(age, name, email);
    }

    public void addCinema(String name, String phone, int seats, double price, String location, double openTime, double closeTime) {
        Cinema cinema = new Cinema(name, phone, seats, price, location, openTime, closeTime,this);
        cinemas.add(cinema);
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }

    public void updateCinemaPrice(Cinema cinema, int newPrice) {
        cinema.setPrice(newPrice);
    }

    public void updateFoodPrice(Menu menu, int newPrice) {
        menu.setFoodPrice(newPrice);
    }
}