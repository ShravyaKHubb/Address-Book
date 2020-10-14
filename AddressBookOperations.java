import java.util.*;

public class AddressBookOperations implements AddressBookInterface{

    String firstName, lastName;
    Scanner scanner = new Scanner(System.in);
    List<Person> contacts = new ArrayList<>();
    Person personInfo;

    public void addPerson() {

        System.out.println("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        lastName = scanner.nextLine();
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
        boolean personExists = false;

        for (int i = 0; i < contacts.size(); i++) {

            personInfo = contacts.get(i);

            if (firstName.equals(personInfo.firstName) && lastName.equals(personInfo.lastName)) {

                System.out.println("Person already exists");
                personExists = true;

            }

        }

        if(!personExists) {

            personInfo = new Person(firstName, lastName, address, city, state, zip, phoneNumber);
            contacts.add(personInfo);
            System.out.println("Contact " + firstName + " " + lastName + " added!");

        }

    }

    public void editPerson() {

        String newDetails;
        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        lastName = scanner.nextLine();

        for (int i = 0; i < contacts.size(); i++) {

            personInfo = contacts.get(i);

            if (firstName.equals(personInfo.firstName) && lastName.equals(personInfo.lastName)) {

                System.out.println("Edit: 1.Address\n 2.City\n 3.State\n 4.Zip\n 5.Phone number ");
                int editChoice = scanner.nextInt();

                switch (editChoice) {

                    case 1:
                        System.out.println("Enter new address: ");
                        scanner.nextLine();
                        newDetails = scanner.nextLine();
                        personInfo.address = newDetails;
                        break;

                    case 2:
                        System.out.println("Enter new city: ");
                        scanner.nextLine();
                        newDetails = scanner.nextLine();
                        personInfo.city = newDetails;
                        break;

                    case 3:
                        System.out.println("Enter new state: ");
                        scanner.nextLine();
                        newDetails = scanner.nextLine();
                        personInfo.state = newDetails;
                        break;

                    case 4:
                        System.out.println("Enter new zip: ");
                        scanner.nextLine();
                        newDetails = scanner.nextLine();
                        personInfo.zip = newDetails;
                        break;

                    case 5:
                        System.out.println("Enter new phone number: ");
                        scanner.nextLine();
                        newDetails = scanner.nextLine();
                        personInfo.phoneNumber = newDetails;
                        break;

                }

            }

        }

    }

    public void deletePerson() {

        for (int i = 0; i < contacts.size(); i++) {

            personInfo = contacts.get(i);
            System.out.println("Enter first name: ");
            firstName = scanner.nextLine();
            System.out.println("Enter last name: ");
            lastName = scanner.nextLine();

            if (firstName.equals(personInfo.firstName) && lastName.equals(personInfo.lastName)) {

                contacts.remove(i);

            }

        }

        System.out.println("Contact " + firstName + " " + lastName  + " deleted!");

    }

    public void sortAlphabetically() {

        Collections.sort(contacts, new SortByFirstName());
        System.out.println("Data after Sort By Zip: ");

        for (Person person : contacts) {

            person.display();

        }

    }

}
