import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    //Welcome to Address Book Program

    public static void main(String args[]) {

        ArrayList<String> addressBook = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        addressBook.add(firstName);
        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();
        addressBook.add(lastName);
        System.out.println("Enter address : ");
        String address = scanner.nextLine();
        addressBook.add(address);
        System.out.println("Enter city: ");
        String city = scanner.nextLine();
        addressBook.add(city);
        System.out.println("Enter state: ");
        String state = scanner.nextLine();
        addressBook.add(state);
        System.out.println("Enter zip: ");
        String zip = scanner.nextLine();
        addressBook.add(zip);
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        addressBook.add(phoneNumber);

    }

}
