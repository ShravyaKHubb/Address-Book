import java.util.Scanner;

public class AddressBookMain {

    //Welcome to Address Book Program

    public static void main(String args[]) {

        AddressBookOperations addressBookOperations = new AddressBookOperations();

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose: 1.Add person\n 2.Edit person\n 3.Delete person\n 4.Sort alphabetically");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addressBookOperations.addPerson();
                    break;

                case 2:
                    addressBookOperations.editPerson();
                    break;

                case 3:
                    addressBookOperations.deletePerson();
                    break;

                case 4:
                    addressBookOperations.sortAlphabetically();
                    break;
                    
                default:
                    System.out.println("Invalid input");

            }

        }

    }

}
