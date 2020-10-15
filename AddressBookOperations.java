import java.util.ArrayList;

public class AddressBookOperations implements AddressBookInterface{

    @Override
    public void createPerson() {

        ArrayList<String> addressBook = new ArrayList<>();
        addressBook.add("Shravya");
        addressBook.add("K");
        addressBook.add("Bangalore");
        addressBook.add("Bangalore");
        addressBook.add("Karnataka");
        addressBook.add("560062");
        addressBook.add("9591316654");

    }

}
