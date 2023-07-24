public class numberTest {

  int num1;
  int num2;

  public void setNumber1(int a) {
    this.num1 = a;
  }

  public void setNumber2(int b) {
    this.num2 = b;
  }

  public static int divide(int c, int d) {
    return d / c;
  }

  public void print() {
    System.out.println("this.number1=" + this.num1);
  }

  public static int bonus(int i, int j) {
    return i + j;
  }

  public static void main(String[] args) {
    numberTest test1 = new numberTest();
    test1.setNumber1(13);
    test1.setNumber2(26);

    numberTest test2 = new numberTest();
    test2.setNumber1(10);
    test2.setNumber2(100);

    System.out.println(test1.divide());
    System.out.println(test2.divide());

  }

}
