package Shape;

public class Circle11 extends Shape {

  private double radius;

  @Override
  public double area() {
    return Math.pow(this.radius, 2) * Math.PI;

  }

}
