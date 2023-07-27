package Order;

public class ItemDescp {

  private String header;

  private String body;

  public ItemDescp(String header, String body) {
    this.header = header;
    this.body = body;
  }

  public static void main(String[] args) {
    ItemDescp itemdescp1 = new ItemDescp("Apple", "10% off");
    ItemDescp itemdescp2 = new ItemDescp("Orange", "buy 2 get 1");
    Transaction t = new Transaction(1, itemdescp1, 3, 10.5);
    Transaction t2 = new Transaction(2, itemdescp2, 7, 20.05);
    Order order = new Order(new Transaction[] { t, t2 });

    System.out.println(order.getTotal());
  }

}
