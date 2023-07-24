public class rectangle {

  public static double area(double a, double b) {
    return a * b;
  }

  public static double perimeter(double c, double d) {
    return (c + d) * 2;
  }

  public static void main(String[] args) {
    double area1 = area(5.0d, 3.0d);
    double area2 = area(13.0d, 5.0d);
    double perimenter1 = perimeter(10.0d, 90.0d);
    double perimenter2 = perimeter(55.0d, 44.0d);
  }
}
