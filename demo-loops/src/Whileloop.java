public class Whileloop {
  public static void main(String[] args) {
    int count = 0;
    while (count < 5) {
      count++;
    }

    boolean isHoliday = false;
    int counter = 0;
    while (!isHoliday) {
      System.out.println("counter=" + counter);
      counter++;
      if (counter >= 6) {
        isHoliday = true;
      }
    }

    int c2 = 0;
    while (c2 >= 0 && c2 < 5) {
      System.out.println(c2);
      c2++;
    }
    int a = 0;
    int b = 10;
    while (a < 5 || b > 0) {
      System.out.println("hello");
      a++;
      b--;
    }

    int k = 0;
    while (k < 6) {
      System.out.println("break:hello");
      k++; // ++k means + before comparision
      if (k > 3) {
        break;
      }
    }

    int j = 0;
    while (j < 6) {
      j++;
      if (j > 3) {
        continue;
      }
      System.out.println("continue:hello");
    }
  }
}
