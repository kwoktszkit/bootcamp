public interface Move {

  static final int speed = 10;

  void up();

  void down();

  void left();

  void right();

  void jump();

  default void print() {
    System.out.println("I am Java 8 default method");
  }

  static String concat(String a, String){
    return a + b;
  }
}
}