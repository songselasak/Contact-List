package Contact;
import java.util.ArrayList;

public class Contact {
    String firstName;
    String lastName;
    ArrayList<Telephone> telephoneList = new ArrayList<Telephone>();

    public Contact (String firstName, String lastName, ArrayList<Telephone> telephoneList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneList = telephoneList;
    }

    public String getFirstName(){
        return firstName;
    }

    public void update(String firstName, String lastName, ArrayList<Telephone> telephoneList){
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneList = telephoneList;
    }

    @Override
    public String toString() {
        return "FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", Phnone Number='" + telephoneList.toString() + '\'';
    }
}
