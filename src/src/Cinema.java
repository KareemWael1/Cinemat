public class Cinema {
    String cinemaName;
    int noOfSeats;
    double price;
    String location;
    double openTime;
    double closeTime;
    //Movie [] movies;
    //Menu [] menu;

    public Cinema(String cinemaName, int noOfSeats, double price, String location, double openTime, double closeTime /*,Movie[] movies, Menu[] menu */) {
        this.cinemaName = cinemaName;
        this.noOfSeats = noOfSeats;
        this.price = price;
        this.location = location;
        this.openTime = openTime;
        this.closeTime = closeTime;
       // this.movies = movies;
       // this.menu = menu;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
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

   /* public void setMovies(Movie[] movies) {
        this.movies = movies;
    } */

  /*  public void setMenus(Menu[] menus) {
        this.menu = menus;
    } */
    public void viewInfo(){
        System.out.println("Cinemaname:"+cinemaName); 
        System.out.println("price:"+price);
        System.out.println("opening time:"+openTime);
        System.out.println("opening time:"+closeTime);
        System.out.println("location:"+location);
        System.out.println("movies available");
      /*  for (int index=0;index<movies.length;index++) {
            System.out.print(movies[index]);
        } */
    }


    
}
