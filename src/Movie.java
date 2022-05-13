public class Movie {
    private final String title;
    private final float duration;
    private int availableTickets=60;
    private float rating=0;
    private int numOfReviews;

    Movie(String title,float duration){
        this.title = title;
        this.duration=duration;
    }

    public void setAvailableTickets(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public int getNumOfReviews() {
        return numOfReviews;
    }

    public float getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public int getAvailableTickets() {
        return availableTickets;
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


    public float getDuration() {
        return duration;
    }
}
