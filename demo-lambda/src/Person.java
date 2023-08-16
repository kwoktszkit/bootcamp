public class Person implements Swimable {

  Swimable swimable = () -> System.out.println("I am swimming");person1.swim();

  Swimable person2 = () -> System.out.println("person 2 is swimming");
}

}
