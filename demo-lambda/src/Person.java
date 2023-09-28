public class Person implements Swimable {

  @Override
  Swimable swimable = () -> System.out.println("I am swimming");person1.swim();

  Swimable person2 = () -> System.out.println("person 2 is swimming");person2.swim();
}

}
