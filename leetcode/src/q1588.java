public class q1588 {

  public int sumOddLengthSubarrays(int[] arr) {

    int sum1 = 0;
    
    for (int j = 0; j < arr.length; j - 2){
 
    for (int i = 0; i < arr.length - j; i + 2){
        sum1 = sum1 + arr[i];
    }
    }
    return sum1;
}

}
