package com.hkjava.demo.model;

import java.util.ArrayList;
import java.util.List;

public class CartDatabase {

  public static List<Cart> carts = new ArrayList<>();

  /*
   * remove cart by customer id from List<Cart>
   */

  public static void add(int customerId) {

  }

  public static void add(Cart cart) {
    carts.add(cart);
  }
}