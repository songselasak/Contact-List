package Contact;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    ArrayList<Contact> contactList = new ArrayList<Contact>();
    public ContactList(){

    }

    public void add(){
        Scanner sc = new Scanner(System.in);
        String firstName, lastName;
        ArrayList<Telephone> Phone = new ArrayList<Telephone>();
        int num;
        String phoneNum, purpose;
        System.out.print("FirstName: ");
        firstName = sc.nextLine();
        System.out.print("LastName: ");
        lastName = sc.nextLine();
        System.out.print("How many phone number?: ");
        num = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<num; i++){
            System.out.print("Phone number: ");
            phoneNum = sc.nextLine();
            System.out.print("Purpose: ");
            purpose = sc.nextLine();
            Phone.add(new Telephone(phoneNum, purpose));
        }
        contactList.add(new Contact(firstName,lastName,Phone));
    }

    public void update(String name){
        Contact c = findByFirstName(name);
        if(c!=null){
            Scanner sc = new Scanner(System.in);
            String firstName, lastName;
            int num;
            String phoneNum, purpose;
            ArrayList<Telephone> Phone = new ArrayList<Telephone>();

            System.out.print("Input FirstName to update: ");
            firstName = sc.nextLine();
            System.out.print("Input LastName to update: ");;
            lastName = sc.nextLine();
            System.out.print("How many phone number?: ");
            num = sc.nextInt();
            sc.nextLine();

            for (int i=0; i<num; i++){
                System.out.print("Phone number: ");
                phoneNum = sc.nextLine();
                System.out.print("Purpose: ");
                purpose = sc.nextLine();
                Phone.add(new Telephone(phoneNum, purpose));
            }
            c.update(firstName,lastName,Phone);
            System.out.println("Updated.");
        }
        else{
            System.out.println("No student with this id.");
        }
        
    }

    public void remove(String name){
        Contact c=null;
        int count = 0;
        do{
            c = findByFirstName(name);
            if(c!=null){
                count++;
                contactList.remove(c);
            }
        }while(c!=null);
        if(count>0) {
            System.out.println(count+" Contact(s) removed.");
        }
        else {
            System.out.println("No contact with this name.");
        }
    }

    public Contact findByFirstName(String name){
        for(int i=0;i<contactList.size();i++){
            if(name.equalsIgnoreCase(contactList.get(i).getFirstName())){
                return contactList.get(i);
            }
        }
        return null;
    }

    public void show(){
        for (Contact c:contactList) {
            System.out.println(c);
        }
    }
}
