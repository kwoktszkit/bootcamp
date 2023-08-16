package shopping;

public class Item {

  int price;
  String header;
  String description;

  public Item(int price) {
    this.price = price;
  }

  public int getPrice() {
    return this.price;
  }
}
