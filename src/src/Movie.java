public class Movie {
    private final String title;
    private final int duration;
    private int availableTickets=60;
    private float rating=0;
    private int numOfReviews;

    Movie(String title,int duration){
        this.title = title;
        this.duration=duration;
    }


    public boolean availableTickets(int numberOfTickets){
        return availableTickets>numberOfTickets;
    }
    public void bookTickets(int numOfTickets){
        if (availableTickets(numOfTickets)){
            this.availableTickets -= numOfTickets;
            System.out.println("Book confirmed");
        }
        else {
            System.out.println("there is error");
        }
    }
    public void addRate(float rate){
        numOfReviews++;
        rating = rate/numOfReviews;
    }

    public int getDuration() {
        return duration;
    }
}
