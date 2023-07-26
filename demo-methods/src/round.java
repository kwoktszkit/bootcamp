public class round {

  int total = 0;
  double[] arr = new double[]{-5.54, 9.83,5.5};for(
  int i = 0;i<arr.length;i++)
  {
    total = total + (int) Math.round(Math.abs(arr[i]));
  }

}
