
public class ssttring {
  public static void main(String[] args) {

    String str1 = "In the rain";
    str1 = str1 + " " + str1;
    System.out.println(str1);

    int i = str1.length();
    System.out.println("i=" + i);

    String str2 = "abc";
    String str3 = "abcd";
    String str4 = "abc";

    boolean same = str2.equals(str3);
    boolean same2 = str4.equals(str2);

    System.out.println("test1" + " " + same);

    System.out.println("test2" + " " + same2);

    int i1 = i + 1;
    System.out.println(i1);

    String str5 = "helloworld";
    char ch1 = str5.charAt(0);
    char ch2 = str5.charAt(2);

    System.out.println("first index is " + ch1);
    System.out.println("second index is " + ch2);

    boolean same3 = ch1.equals(ch2);

  }

}
