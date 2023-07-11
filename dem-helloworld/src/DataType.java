public class DataType {

  public static void main(String[] args) {
    // Number, Text

    int num; // int is a way to declare a variable
    num = 3;

    String str = "string a text";

    double f = 3.14;
    double f2 = 3;

    byte b = -13;
    short s = -30000;
    long l = -200000L;

    float f1 = 2.02342399f;

    char gender = 'M';

    boolean isMale = true;

    System.out.println(f);
    System.out.println(f2);
    System.out.println("print with double colon");
    System.out.println(1);
    System.out.println(num);
    System.out.println(str);
    System.out.println(b);
    System.out.println(s);
    System.out.println(l);
    System.out.println(f1);
    System.out.println(gender);
    System.out.println(isMale);

    String str1 = "Hello";
    String str2 = "World";
    String result = str1 + str2;

    String result2 = str2 + str1;

    System.out.println(result + " " + result2);

    int a = 1 + 3;
    int b10 = 1 - 3;
    int c10 = 2 - 80;
    int d10 = 2 * 101;
    int e10 = 10 / 3; // 3 and no round up
    int f10 = 10 % 3; // reamainder 1

    String str5 = "" + 13 + 13;
    System.out.println(str5);

  }
}