package shape;

public class Square {

  int length;

  @Override
  public double area() {
    return Math.pow(this.length, 2);
  }

}
