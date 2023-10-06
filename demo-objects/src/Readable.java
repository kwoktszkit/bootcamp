@FunctionalInterface
public interface Readable {

  // 100% abstract method
  void read();

  public static void main(String[] args) {
    Readable readable = () -> System.out.println("hello");

  }

}
