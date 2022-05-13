
public class User extends Person{

    public User (int age, String name, String password){
        super(age, name, password);
    }

    public void bookTicket(Movie movie, int numOfTickets){
        movie.bookTickets(numOfTickets,this);
    }

    public void rateMovie(Movie movie, float rate){
        movie.addRate(rate);
    }
}