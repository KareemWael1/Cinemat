public class Movie {
    private final String title;
    private int availableTickets=60;
    private float rating=0;

    Movie(String title){
        this.title = title;
    }
    public boolean availableTickets(int numberOfTickets){
        return availableTickets>numberOfTickets;
    }


}
