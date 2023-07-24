public class Loop2 {

  public static void main(String[] args) {
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("i=" + i + " j=" + j); // i=1 j=1, i=2, j=1, i=2 j=2, i=3 j=1
        if (i == j) {
          break;
        }
      }
    }
    for (int q = 0; q < 6; q++) {
      for (int r = 0; r < 3; r++) {
        if (q == r) {
          continue; // q=0 r=1, q=0 r=2, q=1 r=0, q=1 r=2, q=2 r=0, q=2 r=1, ...
        }
        System.out.println("q=" + q + " r=" + r);
      }
    }

    String str = "I love programming!";
    System.out.println("str length" + str.length());

    for (int w = 0; w < str.length(); w++) {
      System.out.println("Hello");
    }

    for (int x = 0; x < str.length(); ++x) {
      char ch = str.charAt(x);
      if (str.charAt(x) == 'e') {
        System.out.println("first e is at " + x + "position");
        break;
      }
    }

    boolean found = false;

    for (int y = 0; y < str.length(); ++y) {
      char ch = str.charAt(y);
      if (str.charAt(y) == 'e') {
        found = true;
      }
      break;
    }

    if (found) {
      System.out.println("Found e");
    } else {
      System.out.println("Not found e");
    }

    char target = '0';
    int count = 0;
    boolean found2 = true;
    for (int i = 0; i < str.length(); ++i)
      if (count >= 3) {
        found2 = true;
      }

  }
}