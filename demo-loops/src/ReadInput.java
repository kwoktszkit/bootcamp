import java.util.Scanner;

public class ReadInput
public static void main(String[] args){
  String str = "Hello";
str.charAt(0);

System.out.println("Please input the loop count: ");
  Scanner s = new Scanner(System.in);
 int input = s.nextInt();
 System.out.println("input=" + input);

 for (int i = 0; i < input; i++){
  System.out.println("i = " + i + ", Hello!");
 }
}