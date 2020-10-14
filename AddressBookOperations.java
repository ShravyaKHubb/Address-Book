import java.util.*;

public class AddressBookOperations implements AddressBookInterface{

    String firstName, lastName, address, city, state, zip, phoneNumber;
    int choice;
    Scanner scanner = new Scanner(System.in);
    List<Person> contacts = new ArrayList<>();
    Person personInfo;
    HashMap<Person, String> CityPersonMap = new HashMap<>();
    HashMap<Person, String> StatePersonMap = new HashMap<>();

    public void addPerson() {

        System.out.println("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        lastName = scanner.nextLine();
        System.out.println("Enter address : ");
        String address = scanner.nextLine();
        System.out.println("Enter city: ");
        city = scanner.nextLine();
        System.out.println("Enter state: ");
        state = scanner.nextLine();
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
            CityPersonMap.put(personInfo, city);
            StatePersonMap.put(personInfo, state);
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
                choice = scanner.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Enter new address: ");
                        scanner.nextLine();
                        address = scanner.nextLine();
                        personInfo.address = address;
                        break;

                    case 2:
                        System.out.println("Enter new city: ");
                        scanner.nextLine();
                        city = scanner.nextLine();
                        personInfo.city = city;
                        CityPersonMap.put(personInfo, city);
                        break;

                    case 3:
                        System.out.println("Enter new state: ");
                        scanner.nextLine();
                        state = scanner.nextLine();
                        personInfo.state = state;
                        StatePersonMap.put(personInfo, state);
                        break;

                    case 4:
                        System.out.println("Enter new zip: ");
                        scanner.nextLine();
                        zip = scanner.nextLine();
                        personInfo.zip = zip;
                        break;

                    case 5:
                        System.out.println("Enter new phone number: ");
                        scanner.nextLine();
                        phoneNumber = scanner.nextLine();
                        personInfo.phoneNumber = phoneNumber;
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

        for (Person person : contacts) {

            person.display();

        }

    }

    public void sortByZipStateCity() {

        System.out.println("Sort by: 1.City/n 2.State/n 3.City ");
        choice = scanner.nextInt();
        scanner.nextLine();

        switch(choice) {

            case 1:
                Collections.sort(contacts, new SortByCity());
                break;

            case 2:
                Collections.sort(contacts, new SortByState());
                break;

            case 3:
                Collections.sort(contacts, new SortByZip());

        }

    }

    public void viewPersonByCityOrState() {

        Set<Person> keys = new HashSet<>();
        System.out.println("Choose: 1.city\n 2.State ");
        choice = scanner.nextInt();
        scanner.nextLine();

        switch(choice) {

            case 1:
                System.out.println("Enter city: ");
                city = scanner.nextLine();
                for (Map.Entry<Person, String> person : CityPersonMap.entrySet()) {
                    if (Objects.equals(city, person.getValue())) {
                        keys.add(person.getKey());
                        person.getKey().display();
                    }
                }

            case 2:
                System.out.println("Enter state: ");
                state = scanner.nextLine();
                for (Map.Entry<Person, String> person : StatePersonMap.entrySet()) {
                    if (Objects.equals(state, person.getValue())) {
                        keys.add(person.getKey());
                        person.getKey().display();
                    }
                }

        }


    }

}
