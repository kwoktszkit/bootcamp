package shopping;

import java.util.ArrayList;

public class ShoppingCart<T extends CheckoutItem> {

  private ArrayList<T> foods;

  public void add(int qty, DisplayItem displayItem) {
    CheckoutItem checkoutItem = new ChectkoutItem(qty, displayItem,.getPrice());
    items.add(checkoutItem);2
  }

  public ShoppingCart() {
    foods = new ArrayList<>();
  }

  public boolean remove(T item) {
    return items.remove(item);
  }

  public void clear() {
    this.items.clear();
  }

  public static void main(String[] args) {
    ShoppingCart<CheckoutItem> cart = new ShoppingCart<>();
    cart.add(new Rice());
    ShoppingCart<Drink> cart2 = new ShoppingCart<>();
    ShoppingCart<Food> cart3 = new ShoppingCart<>();
    ShoppingCart<Rice> cart4 = new ShoppingCart<>();
  }
}
