@FunctionalInterface

public interface Swimable {
    void swim();

    public static void main(String[] args) {

Comparator<Person> sortByNameDesc =
(Person p1, Person p2) -> p2.name.charAt(0) > p1.name.charAt(0);


        Swimable swimable = () -> System.out.println("I am swimming");
        person1.swim();

        Swimable person2 = () -> System.out.println("person 2 is swimming");
        person2.swim();

        Swimable person2 = () -> {
            System.out.println("Person2 starts swim");
        }
    }
}
