public class Square extends Shape {

  int length;

  public Square(int length) {
    super();
    this.length = length;
  }

  @Override
  public double area() {
    return this.length * this.length;
  }

  public double divide() {
    return this.length / 3 * 2;
  }

  public static void main(String[] args) {
    Square s1 = new Square(3);
    System.out.println(s1.area());
    Square s2 = new Square(7);
    System.out.println(s2.divide());
  }

}
