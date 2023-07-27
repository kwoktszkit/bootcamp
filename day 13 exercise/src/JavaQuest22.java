/*

Question : Given an integer number n, 
return the difference between the product of its digits and the sum of its digits.
 
Constraints :
1 <= n <= 10^5

Example :

Input: n = 4568
Output: 937
Explanation: 
Product of digits = 4 * 5 * 6 * 8 = 960 
Sum of digits = 4 + 5 + 6 + 8 = 23
Result = 960 - 23 = 937
*/

public class JavaQuest22 {
  public static void main(String[] args) {
    System.out.println(findDifferent(1)); // output : 0
    System.out.println(findDifferent(100000));// output : -1
    System.out.println(findDifferent(234)); // output : 15
    System.out.println(findDifferent(4568));// output : 937
    System.out.println(findDifferent(9999));// output : 6525
    System.out.println(findDifferent(11111));// output : -4
  }

  public static int findDifferent(int n) {
    // code here
    String str = Integer.toString(n);
    int leng = str.length();
    int prod = 1, sum = 0;

    for (int i = 0; i < leng; i++) {
      if (leng > 1) {
        prod = prod * (str.charAt(i) - '0');
        // System.out.println(str.charAt(i) - '0');
        // System.out.println(prod);
        sum = sum + str.charAt(i) - '0';
      } else {
        return 0;
      }
    }
    return Math.abs(sum - prod);

  }
}