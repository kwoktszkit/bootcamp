
public class Calculator {

  private int weight = 2;

  public static int substract(int x, int y) {
    return y - x - this.weight;
  }

   public static int substract2(int x, int y) {
    return y - x - this.weight;
  }

  public int multiply(int x, int y) {
    return x * y;
  }

}
