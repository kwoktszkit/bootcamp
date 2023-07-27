package Order;

public class Order {

  private Transaction[] transactions;

  public Order(Transaction[] transactions) {
    this.transactions = transactions;
  }

  // getTotal() summing all subtotal
  public double getTotal() {
    int total = 0;
    for (int i = 0; i < this.transactions.length; i++) {
      total += transactions[i].subtotal();
    }
    return total;

  }
}
