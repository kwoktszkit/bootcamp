import java.util.HashSet;
import java.util.Set;

public class DemoRecord {

  public static void main(String[] args) {
    Person person = new Person("john", 30);

    Person1 person1 = new Person1("john", 30);
    Person1 anotherPerson = new Person1("john", 30);

    Set<Person1> set = new HashSet<>();
    set.add(person1);

  }

}
