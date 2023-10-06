public class Book {

  // 17 type
  // custom class
  // DATA structures (array, list....)
  // Constructor (private, public, overloading...)
  // method (private, public, overloading, metho signature...)
  // getter setter, lombok, toString

  public String getHello() {
    return;
  }

  public static void main(String[] args) {
    Object x = "123";

    if (x instanceof String) {
      System.out.println("it is string");
    }

    if (x instanceof Integer) {
      System.out.println("it is integer");
    }
    Object y = new Square(7);
    Shape s = new Square(9);
    if (s instanceof Square) {
      System.out.println("it is a square");
    }
    if (y instanceof Square) {
      System.out.println("it is a square");
    }

    System.out.println(s.area());
  }

}
