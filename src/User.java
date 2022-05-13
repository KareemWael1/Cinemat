public class User extends Person{
    int id;

    public User (int age, String name, String password, int id){
        super(age, name, password);
        this.id = id;
    }

    public void bookTicket(Movie movie, int numOfTickets){
        movie.bookTickets(numOfTickets,this);
    }

    public void rateMovie(Movie movie, float rate){
        movie.addRate(rate);
    }
}