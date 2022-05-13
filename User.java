
public class User extends Person{

    public User (int age, String name, String password){
        super(age, name, password);
    }

    public  bookTicket(Movie movie, int numOfTickets,this){
        movie.bookTickets(numOfTickets,this);
    }

    public void rateMovie(Movie movie, float rate){
        movie.addRate(rate);
    }
}