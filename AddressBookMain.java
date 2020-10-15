import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    //Welcome to Address Book Program

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter address : ");
        String address = scanner.nextLine();
        System.out.println("Enter city: ");
        String city = scanner.nextLine();
        System.out.println("Enter state: ");
        String state = scanner.nextLine();
        System.out.println("Enter zip: ");
        String zip = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Person personInfo = new Person(firstName, lastName, address, city, state, zip, phoneNumber);
        System.out.println("Contact added!");

    }

}
