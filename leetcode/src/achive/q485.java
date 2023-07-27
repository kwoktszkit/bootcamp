package achive;

public class q485 {

  public static void main(String[] args) {

    int count = 0;
    int maxCount = 0;
    int[] nums = new int[] {};

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == nums[i + 1]) {
        count++;
      } else if (count > maxCount) {
        maxCount = count;
        count = 0;
      } else {
        count = 0;
      }

    }

  }
}