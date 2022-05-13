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
    ArrayList<Menu> menu=new ArrayList<>();

    public Cinema(String cinemaName, String phone, int noOfSeats , double price, String location, double openTime, double closeTime , CinemaOwner owner ,ArrayList<Movie> movies, ArrayList<Menu> menu ) {
        this.cinemaName = cinemaName;
        this.phoneNumber = phone;
        this.noOfSeats = noOfSeats;
        this.price = price;
        this.location = location;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.movies = movies;
        this.menu = menu;
        this.owner=owner;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }
    public void addMovie(String title, float duartion,int availabletickets){
        Movie movie=new Movie(title,duartion,availabletickets,0,0);
        movies.add(movie);
        owner.addMovie(movie);
    }

    public void setPhoneNumber(int phoneNumber) { //Added this setter #minafadi
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

   public void setMenusArrayList<Menu> menus) {
        this.menu = menus;
    }
       public void viewInfo(){
        System.out.println("Cinemaname:"+cinemaName); 
        System.out.println("price:"+price);
        System.out.println("opening time:"+openTime);
        System.out.println("opening time:"+closeTime);
        System.out.println("location:"+location);
        System.out.println("movies available");
          for (int index=0;index<movies.size();index++) {
            System.out.print(movies.get(index).getTitle());
          }
       }


    
}
