package Area;

public class Circle {

  pirvate int id;
  private double radius;

  private static final double pi = 3.14159;

  private static int counter;

  public Circle() {

    this.id++ =  AddCounter();
  }

  public int getid(){
    return this.id;
  }


  public static void AddCounter() {
    counter++;
  }

  public double area() {
    return Math.pow(this.radius, 2) * pi;
  }

  public double circumference() {
    return 2 * radius * pi;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public static void main(String[] args) {
    Circle c = new Circle();
    c.setRadius(2);
    c.area();
    c.circumference();
    Circle c2 = new Circle();
    c2.setRadius(5);

  }

}
