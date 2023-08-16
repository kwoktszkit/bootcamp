public class Studentt extends Person22 implements Personn, Swim, Move {

  private String name;

  @Override
  public void run() {
    System.out.println("I am sleeping");
  }

  @Override
  public void eat() {
    System.out.println("I am eating");
  }

  @Override
  public void swim() {
    System.out.println("I am swimming");
  }

  public static void main(String[] args) {
    System.out.println(Move.MaxSPEED);

    Move move = new Studentt();
    move.up();
    move.down();
    move.left();
    move.right();

    Move dog = new Dog();
    dog.up();
    dog.down();
    dog.left();
    dog.right();

    Swim swim = new Studentt();
    swim.swim();

    Person22 person = new Studentt();
    person.breath();
    person.getAge();
  }

}
