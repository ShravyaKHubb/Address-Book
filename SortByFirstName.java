import java.util.Comparator;

public class SortByFirstName implements Comparator<Person> {

        @Override
        public int compare(Person person1, Person person2) {


            return (person1.firstName).compareTo(person2.lastName);
        }

}
