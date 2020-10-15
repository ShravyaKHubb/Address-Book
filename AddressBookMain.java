import java.util.Scanner;

public class AddressBookMain {

    //Welcome to Address Book Program

    public static void main(String[] args) {

        AddressBookOperations addressBookOperations = new AddressBookOperations();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Choose:\n 1.Add person\n 2.Edit person \n 3.Delete person ");
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

                default:
                    System.out.println("Invalid input");

            }

        }

    }

}
