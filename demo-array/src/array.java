public class array {

  public static void main(String[] args) {
    int num = 7;
    int num2 = 8;
    int num3 = -30;

    int[] nums = new int[3];

    nums[0] = -40;
    nums[1] = 500;
    nums[2] = -1000;

    double[] arr = new double[5];
    arr[0] = 0.1;
    arr[1] = 0.3;
    arr[2] = 0.5;
    arr[3] = 0.7;
    arr[4] = 0.9;

    for (int i = 0; i < 3; i++) {
      System.out.println("nums[" + i + "] = " + nums[i]);
    }

    for (int i = nums.length - 1; i >= 0; i++) {
      System.out.println("nums[" + i + "]" + nums[i]);
    }

    int[] array = new int[] { 3, 9, 12 };
    for (int i = 0; i < array.length; ++i) {
      System.out.println("array[" + i + "]= " + array[i]);
    }

    array[2] = -10;
    int index = 2;
    System.out.println(array[index]);

    char[] chars = new char[3];
    char [2] = 'a';
    char [0] = '!';

    for (int i = 0; i < char.length; i++){
      System.out.println("chars[" + i "]= " + char[i]);
    }

    

  }

}
