public class LogicalOperator {
  public static void main(String[] args) {

    boolean Expensive = true;
    boolean Worth = false;
    boolean result = Expensive && Worth; // and

    boolean result2 = Expensive || Worth; // or

    int a = 5;
    int b = 10;
    int c = 13;

    boolean result3 = a > 6 && b < 12; // false
    boolean result4 = c < 15 || a > 6 && b < 12; // true
    boolean result5 = c < 15 || (a > 6 && b < 12); // true
    boolean result6 = a < 6 || b < 9 || c < 9; // true

    boolean result7 = a == b; // false

    boolean result11 = !(c < 13); // true
    boolean result12 = !(b == 9) && (c != 13);

    // operators precedenc
    int result13 = (1 + 9) * 3; // 30
    int result14 = ++result13 + 1; // 32
    int i = 27;
    int result15 = i++ + 1; // result15=28, i=28

    int x = 5;
    int y = 10;
    int z = x += 3 * y; // 35,
    x = 5;
    int result17 = (x++ + 2) * x++; // 42, [(5+2) then x become 6, another x is 6 before times,
    // then become 7

    System.out.println("result17 = " + result17);

  }

}
