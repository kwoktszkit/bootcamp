package Shape;

import java.math.BigDecimal;

public abstract class Shape {

  public abstract double area();

  Circle11 circle = new Circle11(10.0d);
  Square11 square = new Square10(3.0d);
  Shape[] shapes = new Shape[] { circle, square };

  public static double area(Shape[] shapes) {

    BigDecimal total = BigDecimal.valueOf(0);
  for (Shape s : shapes){}
    total = total.add(BigDecimal.valueOf(s.area()));
   
  }return total.doubleValue();
}
