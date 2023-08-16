package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Shape {
  abstract double area();

  public static double area(List<? extends Shape> shapes) {
    BigDecimal total = BigDecimal.ZERO;

    for (Shape shape : shapes) {
      total = total.add(BigDecimal.valueOf((shape.area())));
    }
    return total.doubleValue();
  }

  public static void main(String[] args) {
    Shape shape = new Circle();
    Shape shape2 = new Square();
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    List<? extends Shape> list = new ArrayList<Circle>();
    list = new ArrayList<Square>();

    List<Map<String, String>> list2 = new ArrayList<>();
    list2.add(new HashMap<>());
  }
}
