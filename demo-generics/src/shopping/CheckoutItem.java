package shopping;

public class CheckoutItem extends Item {

  private int qty;

  public CheckoutItem(int qty) {
    this.qty = qty;
  }

  public int getQuantity() {
    return this.qty;
  }

}
