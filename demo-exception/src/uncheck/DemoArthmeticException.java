package uncheck;

public class DemoArthmeticException {

  public static void main(String[] args) {
    int i = 0;
    int n = 100;
    int result = 0;

    try {
      result = n / i;
    } catch (ArithmeticException e) {
      result = 0;
    }

  }
}