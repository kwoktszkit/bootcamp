public class Printer<T> {

  T value;
  Object object;

  public T getValue() {
    return this.value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public static void main(String[] args) {
    Printer<String> p1 = new Printer<>();
    p1.setValue("abc");
    System.out.println(p1.getValue());

    Printer<Integer> p2 = new Printer<>();
    p2.setValue(100);
    System.out.println(p2.getValue());

    Printer<Boolean> p3 new Printer<>();
    p3.setObject("String");
    System.out.println(p3.getObject());

  }

}
