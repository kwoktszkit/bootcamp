package Equall;

public class Point11 {

  private int x;
  private int y;

  public Point11(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public int hashCo
  return Objects.hash(this.x, this.y);
  
  
  @Override
  
  public boolean equals(Object p) {

    if (this == p)
      return true;
    if (!(p instanceof Point11))
      return false;
    Point11 point = (Point11) p;
    return point.x == this.x && point.y == this.y;
  }

  public static void main(String[] args) {
    Point11 p1 = new Point11(1, 1);
    Point11 p2 = new Point11(1, 1);
    Point11 p3 = new Point11(1, 2);
    System.out.println(p1 == p2);
    System.out.println(p2 == p3);
  }

}
