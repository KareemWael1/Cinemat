import java.util.*;
public class Movie {
    private final String title;
    private final float duration;
    private int availableTickets;
    private float rating=0;
    private int numOfReviews;
    ArrayList<User> users =new ArrayList<>();

    Movie(String title,int duration){
        this.title = title;
        this.duration=duration;
    }


    public boolean availableTickets(int numberOfTickets){
        return availableTickets>numberOfTickets;
    }
    public void bookTickets(int numOfTickets, User user){
        if (availableTickets(numOfTickets)){
            this.availableTickets -= numOfTickets;
            users.add(user);
            System.out.println("Book confirmed \n Ticket number is " + user.size()  );

        }
        else {
            System.out.println("there is error");
        }
    }

    public float getRating() {
        return rating;
    }

    public void addRate(float rate){
        numOfReviews++;
        rating = rate/numOfReviews;
    }

    public String getTitle() {
        return title;
    }

    public float getDuration() {
        return duration;
    }
}
