public class DemoRecursion {

  public static void main(String[] args) {

  }

  public static int sum(int k) {
    if (k < 1) {
      return k;
    }
    return k + sum(k - 1);
  }

  public int sum2(int k) {
    if (k <= 1)
      return k;
    return +sum2(k - 1) + sum2(k - 2);
  }

  public void print(int k) {
    if (k < 1)
      return;
    System.out.print(k + " ");
    print(k - 1);
    System.out.print(k + " ");
  }
}
