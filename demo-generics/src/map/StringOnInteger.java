package map;

public class StringOnInteger {
  private final Object value;

  private StringOnInteger(Object value) {
    value = this.value;
  }

  public static StringOnInteger of(String value) {
    return new StringOnInteger(value);
  }

  public static StringOnInteger of(Integer value) {
    return new StringOnInteger(value);
  }

}
