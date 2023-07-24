public class Loop {

  public static void main(String[] args) {

    for (int i = 0; i < 4; i++) // declare, test, modify after loop
    {
      System.out.println("Lets loop! Number" + i);
    }

    for (int de = 5; de >= 1; --de) {
      System.out.println("Lets loop! Count on" + de + "!");
    }

    for (int table = 1; table < 6; table++) {
      for (int chair = 1; chair < 5; ++chair) {
        System.out.println("table no:" + table + " chair no:" + chair);
      }
    }

    int sum = 0;
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 1) { // sum=0,
        sum += i;
      }
    }
    System.out.println("sum of odd within 10 is " + sum);

    for (int i = 0; i < 5; ++i) {
      if (i > 2) {
        break;
      }
      System.out.println("break at 2");
    }

    for (int q = 0; q < 5; q++) {

      for (int r = 0; r < 4; ++r) {
        System.out.println("q=" + q + " r=" + r);
      }

    }

    for (int m = 1; m < 6; m++) {

      for (int n = 0; n < m; n++) {
        System.out.print("*");
      }
      System.out.println("");
    }

  }

}
