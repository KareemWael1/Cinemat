public class User extends Person{
    int ticketNo;

    public User (int age, String name, String password){
        super(age, name, password);
    }

    public void bookTicket(Movie movie, int numOfTickets){
        movie.bookTickets(numOfTickets);
    }

    public void rateMovie(Movie movie, float rate){
        movie.addRate(rate);
    }
}