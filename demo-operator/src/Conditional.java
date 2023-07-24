public class Conditional {

  public static void main(String[] args) {
    // if, else if, else
    int i = 10;
    if (i > 9) {
      System.out.println("i = " + i);
    }

    // flow control
    if (i < 8) {
      System.out.println("i is smaller than 8");
    } else {
      System.out.println("i is larger than of equpas to 8");
    }

    // else if
    if (i > 12) {
      System.out.println("i > 12");
    } else if (i <= 12 && i >= 0) {
      System.out.println("i <= 12 and i >=0");
    } else {
      System.out.println("i is negative");
    }

    int a = 2;
    int b = 5;
    int box = 0;

    if (a > b) {
      box = 10;
    } else {
      box = 19;
    }

    int number = 11;
    if (number % 2 == 1) {
      System.out.println("number is an odd number");
    }
    if (number % 2 == 0) {
      System.out.println("number is an even number");
    }

    String str = "Monday";
    if (str.equals("Monday")) {
      System.out.println("str = Monday");
    }

    if (str.charAt(4) == 'd') {
      System.out.println("Yes it is d at 4th");
    } else {
      System.out.println("No it is not d at 4th");

      if (str.length() > 10) {
        System.out.println("Yes it is more than 10 char");
      } else {
        System.out.println("No it is not more than 10 char");
      }

      int score = 89;
      char grade = ' ';
      if (score >= 90) {
        grade = 'A';
      } else if (score >= 80) {
        grade = 'B';
      } else if (score >= 70) {
        grade = 'C';
      } else if (score >= 60) {
        grade = 'D';
      }

      int age = 65;
      boolean isElderly = true;

      if (age >= 65) {
        isElderly = true;
      }
      if (isElderly) {
        System.out.println("yes he is an elderly.");
      }
      if (isElderly && gender = 'F') {
        System.out.println("yes he is an elderly.");
      }

      int dayofweek = 3;
      String dayName = "";
      switch (dayofweek) {
        case 1:
          dayName = "Monday";
          System.out.println(1);
          break;
        case 2:
          dayName = "Tuesday";
          System.out.println(2);
          break;
        case 3:
          dayName = "Wedesday";
          System.out.println(3);
          break;
        case 4:
          dayName = "MThursday";
          System.out.println(4);
          break;
        case 5:
          dayName = "Friday";
          System.out.println(5);
          break;
      }

    }

    char grade2 = 'B';
    int pocketMoney = 0;
    switch (grade2) {
      case 'A':
        pocketMoney += 100;
        break;
      case 'B':
        pocketMoney += 70;
        break;
      case 'C':
        pocketMoney += 20;
        break;
      default:
        pocketMoney += 5;
    }
    System.out.println("pocket money=" + pocketMoney);

  }

}
