public class JavaQuest6 {
  public static void main(String[] args) {

    /**
     * Expected output:
     * 1 1 2 3 5 8 13 21 ...
     * 
     */

    // for loop to print first 15 numbers in Fibonacci Sequence

    // str = str + a + " " + b;

    // System.out.println(str);

    int a = 0;
    int b = 1;
    int c = 0;
    int count = 15;
    System.out.print(a + " " + b);

    for (int t = 2; t < count; t++) {
      c = a + b;
      System.out.print(" " + c);
      a = b;
      b = c;
    }

  }
}
