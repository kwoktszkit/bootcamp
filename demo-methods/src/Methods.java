public class Methods {

  public static void print() {
    System.out.println("Hello in print() method.");
  }

  public static int sum(int a, int b) {
    int c = a + b;
    return c;
  }

  public static int substract(int d, int e) {
    return d - e;
  }

  public static void method2(String str) {
    System.out.println("string= " + str);
    method2("Hellow");
    method2("call out method2");
  }

  public static double pi() {
    return 3.14159;
  }

  double circleArea = 5 * 5 * pi();System.out.println("Circle area = "+pi*)

  public static void main(String[] args) {

    String str = "hello";
    str = str + " World";

    System.out.println("Hello in print() method.");

    print();

    int x = 10;
    int y = 100;
    int sum = x + y;

    int z = sum(x, y);
    int i = sum(1000, -30);
    if (sum(1000, -30) == 970){
      System.out.println("The sum is 970";)
    }


  }
}