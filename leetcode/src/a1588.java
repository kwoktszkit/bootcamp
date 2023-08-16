public class a1588 {

  // Sub-problem
  int length = 3; // subarray length (未完成)
  int sum = 0;
  int j = 0;
  // arr = [1,4,2,5,3]
  for(
  int i = 0;i<arr.length;i++)
  {
    if (i + length > arr.length)
      break;
    // i = 0, 1, 2
    j = i;
    while (j < length + i) {
      // i = 0, j = 0, 1, 2
      // i = 1, j = 1, 2, 3
      // i = 2, j = 2, 3, 4
      sum += arr[j];
      j++;
    }
  }return sum;
}}