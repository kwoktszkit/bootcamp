public class TwoD {

  public static void main(String[] args) {
    int[] nums = new int[3];
    nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    int[][] matrix = new int[3][4];

    System.out.println(matrix.length);
    System.out.println(matrix[0].length);

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[i][j] = new Random().nextInt(13);
      }
    }

    System.out.println(Arrays.deepToString(matrix));

    int idx = 0;
    int[] arr = new int[matrix.length * matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        arr[idx++] = matrix[i][j];
      }
    }

    String str = "";
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        str += matrix[i][j];
      }
    }
    System.out.println(str);
  }

}
