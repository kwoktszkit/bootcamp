import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

public class Chectout {

  @NonNull

  private Calculator calculator;

  public int add(int x, int y) {
    // Calculator calculator = new Calculator(3);
    if (x > 1) {
      return y + this.calculator.substract(x, y);
    }
    return x + y;
  }

  public int multiply(int x, int y) {
    if (x > 1) {
      return y + this.calculator.multiply(x, y);
    } else if (x == 0) {
      return y + this.calculator.substract(x, y);
    }
    return this.calculato.multiply(x, y);
  }

}
