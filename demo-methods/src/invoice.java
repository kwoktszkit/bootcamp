public class invoice {

  public static double calcTotalItemPrice(int quantity, double unitPrice) {
    if (quantity < 0 || unitPrice < 0) {
      return 0;
    }
    return quantity * unitPrice;

  }

  public static double calcInvoiceTotalAmount(double[] totalItemPrices) {
    double total = 0.0d;
    for (int i = 0; i < totalItemPrices.length; i++) {
      total += totalItemPrices[i];
    }
    return total;
  }

  }

  public static void main(String[] args){
    int[] quantities = new int[] {5, 10, 4, 7, 20};
    double[] unitPrices = new double[] (10.9, 100.3, 2.1, 9.0, 1000.3);

    double[] totalItemPrices = new double [unitPrices.length];
    for (int i = 0; i < totalItemPrices.length; i++){
      totalItemPrices[i] = calcTotalItemPrice(quantities[i], unitPrices[i]);
    }
    
      double[] InvoiceTotalAmount = new double [unitPrices.length];
  
  }

}
