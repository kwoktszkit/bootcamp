public class Array3 {

  public static void addOne(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] + 1;
    }

  }

  public static void main(String[] args) {
    int[] nums = new int[] { 3, 4, 8 };
    addOne(nums);

    
  }
}
