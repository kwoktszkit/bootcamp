import java.util.ArrayList;

public class DemoGenerics {

  public static void main(String[] args) {

    ArrayList<String> strings = new ArrayList<>();

    Zoo<Dog> zoo1 = Zoo.of(Dog.of("xyz"));
    zoo1.setAnimal(Dog.of("def"));

    Zoo<Animal> zoo2 = Zoo.of(new Cat());
    zoo2.setAnimal(new Animal());
    zoo2.setAnimal(Dog.of("abc"));
    zoo2.setAnimal(new Cat());

    Box<Integer> box = getBox(Integer.valueOf(100));
    Object object = getBox(Double.valueOf(1.0d));
    double d1 = (Box<Double>) object;
  }

  public static <T extends Number> Box<T> getBox(T element) {
    return new Box<>(element);
  }
}