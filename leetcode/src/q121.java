public class q121 {

  double[] prices = new double[] {};

  double max;
  double min;
  int maxIdx;
  int minIdx;
  double profit = max - min;

  for(
  int i = 0;i<prices.length;i++)
  {
    if (prices[i] > max) {
      max = prices[i];
      maxIdx = i;
    } else if (prices[i] < min) {
      min = prices[i];
      minIdx = i;
    }
  }return profit;

}
