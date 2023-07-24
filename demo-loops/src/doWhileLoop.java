public class doWhileLoop {

  public static void main(String[] args) {
    int count = 0;
    do {
      System.out.println("hello, count=" + count);
      count++;
    } while (count < 3);

    int input = 0;
    Scanner scanner;
    do {
      scanner = new Scanner(System.in);
      System.out.println("plwase input a integer:");
      input = scanner.nextInt();
    } while (input % 2 == 0);
    System.out.println("input=" + input);

  }

}
