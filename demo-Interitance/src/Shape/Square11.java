package Shape;

public class Square11 extends Shape {

  private double length;

  @Override
  public double area() {
    return Math.pow(this.length, 2);
  }

}
