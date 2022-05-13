import java.util.*;
public class Cinema {

    String cinemaName;
    String phoneNumber; // Added this field #minafadi
    int noOfSeats;
    double price;
    String location;
    double openTime;
    double closeTime;
    CinemaOwner owner;
    ArrayList<Movie> movies =new ArrayList<>();
    ArrayList<Menu> menus =new ArrayList<>();

    public Cinema(String cinemaName, String phone, int noOfSeats , double price, String location, double openTime, double closeTime , CinemaOwner owner) {
        this.cinemaName = cinemaName;
        this.phoneNumber = phone;
        this.noOfSeats = noOfSeats;
        this.price = price;
        this.location = location;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }
    public void addMovie(String title, float duration,int availableTickets){
        Movie movie=new Movie(title,duration,availableTickets);
        movies.add(movie);
        owner.addMovie(movie);
    }

    public void setPhoneNumber(String phoneNumber) { //Added this setter #minafadi
        this.phoneNumber = phoneNumber;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setOpenTime(double openTime) {
        this.openTime = openTime;
    }

    public void setCloseTime(double closeTime) {
        this.closeTime = closeTime;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public void setMenus(ArrayList<Menu> menus) {
        this.menus = menus;
    }
    public void viewInfo(){
        System.out.println("Cinema Name:"+cinemaName);
        System.out.println("price:"+price);
        System.out.println("opening time:"+openTime);
        System.out.println("opening time:"+closeTime);
        System.out.println("location:"+location);
        System.out.println("movies available");
        for (Movie movie : movies) {
            System.out.print(movie.getTitle());
        }
    }
}