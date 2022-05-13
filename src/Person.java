

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author karim
 */
public class Person {
    protected int age;
    protected String name;
    protected String email;

    public Person(int age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }
    public static boolean validate(String username , String password){
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://sql4.freesqldatabase.com:3306/sql4490831","sql4490831","4u3HLjKEi2");
            Statement st = c.createStatement();
            String q ="SELECT * FROM register WHERE username ='"+username+"' AND password='"+password+"'";
            ResultSet res = st.executeQuery(q);
            if(res.isBeforeFirst()){

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c2 = DriverManager.getConnection("jdbc:mysql://sql4.freesqldatabase.com:3306/sql4490831","sql4490831","4u3HLjKEi2");
                java.util.Date d1 = new java.util.Date();
                String date = d1.toString();
                String L ="INSERT INTO login (username,password,logindate) VALUES('"+username+"','"+password+"','"+date+"')";
                Statement inlog = c2.createStatement();
                inlog.execute(L);
                return true;
            }
            return false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
