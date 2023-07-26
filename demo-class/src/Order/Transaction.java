package Order;

public class Transaction {

  private int itemNo;

  private ItemDescp itemDescp;

  private int qty;

  private double unitPrice;

  public Transaction(int itemNo, String ItemDescp, int qty, double unitPrice) {
    this.itemNo = itemNo;
    this.itemDescp = itemDescp;
    this.qty = qty;
    this.unitPrice = unitPrice;
  }

  public int getItemNo() {
    return this.itemNo;
  }

  public String getItemDescp() {
    return this.itemDescp;
  }

  public int getQty() {
    return this.qty;
  }

  public double getunitPrice() {
    return this.unitPrice;
  }

  public int setItemNo() {
    return this.itemNo;
  }

  public String setItemDescp() {
    return this.itemDescp;
  }

  public int setQty() {
    return this.qty;
  }

  public double getUnitPrice() {
    return this.unitPrice;
  }

}
