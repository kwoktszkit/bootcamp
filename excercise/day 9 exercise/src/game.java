import java.util.Scanner;

public class game {

  public static void main(String[] args) {

    int min = 1;
    int max = 100;
    int bomb = new Random().nextInt(100) + 1;
    int input;

    Scanner scanner;
   
    do{scanner = new Scanner(System.in);
    System.out.print("Please input a number (" + min + "-" + max + "):");
    input = scanner.nextInt();
    if (input < min || input > max){continue;
    }
    if (input<bomb){min=input + 1;}
    } while
   

  }

}
