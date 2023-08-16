package uncheck;

public class DemoNumberFormateEx {

  public static void main(String[] args) {
    try {
      Integer.valueOf("abc");
    } catch (NumberFormatException e) {
      System.out.println("Number Format Issue");
    }
  }

}
