/*
 * Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
 * 
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 * 
 */

import java.util.Arrays;

public class JavaQuest46 {
  public static void main(String[] args) {
    System.out.println(findGCD(new int[] { 2, 5, 6, 9, 10 }));
    System.out.println(findGCD(new int[] { 7, 5, 6, 8, 3 }));
    System.out.println(findGCD(new int[] { 3, 3 }));

  }

  public static int findGCD(int[] nums) {

    Arrays.sort(nums);
    int firstNum = nums[0], lastNum = nums[nums.length - 1];
    return gcd(firstNum, lastNum);
  }

  public static int gcd(int a, int b) {
    if (a > b) {
      int temp = a;
      a = b;
      b = temp;
    }
    if (b % a == 0)
      return a;
    return gcd(a, b % a);
  }
}