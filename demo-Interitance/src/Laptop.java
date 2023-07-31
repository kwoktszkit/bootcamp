public class Laptop extends Machine {

  private Keyboard keyboard;
  private Monitor monitor;

  public Laptop() {
  }

  }

  public Laptop(Keyboard keyboard, Monitor monitor) {
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  public Laptop(String buttonType, int noOfButton, double length, double width) {
    this.keyboard = new Keyboard(buttonType, noOfButton);
    this.monitor = new Monitor(length, width);
  }

  public Laptop(double weight, Keyboard keyboard, Monitor monitor) {
    super(weight);
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  @Override
  public void start() {
    System.out.println("Laptop start");
  }

  @Override
  public void stop() {
    System.out.println("Laptop stop");
  }

  public static void main(String[] args) {
    Laptop laptop = new Laptop("abc", 100, 15, 10);
    laptop.getWeight(3.0d);
    System.out.println(laptop.getWeight());
    laptop.start();
    laptop.stop();

    Machine machine = new Machine();
    machine.setWeight(5.0d);
    System.out.println(machine.getWeight());
    machine.start();
    machine.stop();

    Laptop laptop2 = new Laptop();
    laptop2.setWeight(10.0d);
    System.out.println(laptop2.getWeight());

    Laptop laptop3 = new Laptop();
    laptop2.setWeight(10.0d);
    System.out.println(laptop3.getWeight());
    System.out.println(Machine.staticMethod("abc", "def"));
    System.out.println(Laptop.staticMethod("abc", "def"));
  }
}
