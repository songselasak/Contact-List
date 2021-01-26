package Contact;
import java.util.Scanner;

public class ContactMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option, loop=1;
        String firstName;
        ContactList lst = new ContactList();

        while(loop==1) {
            System.out.println("1. Add new Contact");
            System.out.println("2. Update Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Listing Contact");
            System.out.println("5. Exit");
            System.out.print("\nChoose an option: ");
            option = sc.nextInt();

            switch(option) {
                case 1:
                    lst.add();
                    break;
                    
                case 2:
                    sc.nextLine();
                    System.out.print("Input Firstname to check for update: ");
                    firstName=sc.nextLine();
                    lst.update(firstName);
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Input Firstname to remove: ");
                    firstName=sc.nextLine();
                    lst.remove(firstName);
                    break;

                case 4:
                    lst.show();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    loop = 0;
                    sc.close();
                    break;

                default:
                    System.out.println("Unknown commands, please try again!");
              }
              System.out.println();
        }
    }
}
