public class Demo {

  public static void main(String[] args) throws Exception {
    System.out.println(grade(90));

    Weekday weekday = Weekday.TUE;
    int result = switch (weekday) {
      case MON -> 1;
      case TUE -> 2;
      case WED -> 3;
      case THU -> 4;
      case FRI -> 5;
    };

       int result2 = switch (weekday){
      case MON, TUE:
      System.out.println("Monday or Tuesday");
      case WED:
      System.out.println("Wednesday");
    }
  }

  public static int getDayNumber(Weekday weekday) {
    switch (weekday) {
      case MON:
        return 1;
      case TUE:
        return 2;
      case WED:
        return 3;
      case THU:
        return 4;
      case FRI:
        return 5;
      default:
        return 0;
    }
  }

  public static char grade(int score) {
    char garde = ' ';
    switch (score) {
      case 90:
        grade = 'A';
        break;
      case 80:
        grade = 'B';
      default:
        grade = 'F';
    }
    return grade;
  }
}
