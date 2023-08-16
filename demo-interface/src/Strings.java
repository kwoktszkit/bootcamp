public class Strings implements CharSequence {

  char[] arr;

  public Strings(String str) {
    arr = new char[str.length()];
  }

  public Strings valueOf(String str) {
    return new Strings(str);
  }

  @Override
  public int length() {
    return arr.length;
  }

  @Override
  public char charAt(int idx) {
    return this.arr[idx];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    if (end < start || start < 0 || end < 0 || start < this.arr.length - 1
        || end > this.arr.length)
      return String.valueOf(this.arr);
    StringBuilder sb = new StringBuilder();
    for (int i = start; i < end; i++) {
      sb.append(this.arr[i]);
    }

  }

  public static void main(String[] args) {
    String str = "abc";
    Strings s = Strings.valueOf("abc");

  }

}
