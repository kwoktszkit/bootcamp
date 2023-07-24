public class insertionSort {
  public static void main(String[] args) {
    // [5,1,4,8,2]
    int[] arr = new int[] { 5, 1, 4, 8, 2 };
    int temp = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > arr[i + 1]) {
        temp = arr[i + 1];
        arr[i + 1] = arr[i];
        arr[i] = temp;
      }

    }

  }
}