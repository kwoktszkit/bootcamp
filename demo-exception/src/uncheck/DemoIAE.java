package uncheck;

public class DemoIAE {

  public static int add(int a, int b) {
    if (a < 0 || b < 0)
      throw new IllegalArgumentException();
    return a + b;
  }

  public static void main(String[] args) {
    try {
      add(1, 4);
      add(-1, 5);
    } catch (IllegalArgumentException e) {
      System.out.println("Skip the process");
    }

  }

}
