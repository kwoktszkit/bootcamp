public class Circle2 {

  private double radius;
  private static final double pi = 3.14159;

  private Circle2(double radius) {
    this.radius = radius;
  }

  public BigDecimal area() {
    return BigDecimal.valueOf(this.radius)
        .multiply(BigDecimal.valueOf(this.radius))
        .multiply(BigDecimal.valueOf(pi));
  }

  public static void main(String[] args) {
    System.out.println(0.1 * 0.1 * pi);
    System.out.println(Circle2.of(0.1d).area());
  }
}
