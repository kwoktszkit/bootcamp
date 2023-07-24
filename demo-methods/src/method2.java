public class method2 {

  public static void main(String[] args) {

    int[] nums = new int[] { 1, 2, 10, 3, 4, 20 };
    products(nums);

  }

  public static int[] products(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      arr[i] = product(arr[i], arr[i + 1]);
    }
    return arr;
  }

  public static int product(int a, int b) {
    return a * b;
  }

}