public class carMain {
  public static void main(String[] args) {
    Car car = new Car(); // constructor
    Car car2 = new Car();
    Person person = new Person();
    Computer computer = new Computer();
    String str = new String("Hello");

    System.out.println(car2.getcapacity());
    System.out.println(car2.getcolor());
    System.out.println(car2.getnoOfWheel());

    car2.setcolor("YELLOW");
    car.setcolor("BLUE");

    CarFactory carFactory = new CarFactory();
    carFactory.changeColor(car2, "WHITE");
    System.out.println(car2.getColor());

    Person person2 = new Person();
    Computer computer2 = new Computer();
    String str2 = new String("Hello");

    car 2 = new Car(3, 4, "Black");

  }
}
