public class StringBox {

  private String string;

  public StringBox() {

  }

  public StringBox(String string) {
    if (string == null) {
      this.string = "";
    }
    this.string = string;
  }

  public String getString() {
    return this.string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public StringBox append(String str) {
    if (str == null || "".equals(str)) {
      return this;
    }
    this.string = this.string + str;
    return this;
  }

  public StringBox insert(int idx, String s) {
    if (idx < 0) {
      return this;
    }
    if (s == null || "".equals(s)) {
      return this;
    }
    return new StringBox(s.substring(idx) + s + s.substring(idx));

  }

  public char[] toCharArray(){
    char[] chs = new char[this.string.length()];
    for(int i = 0; i < chs.length; i++){
      chs[i] = this.string.charAt(i);

    }
    return chs;

  public String toString() {
    return this.string;
  }

  public static void main(String[] args) {
    StringBox s = new StringBox();
    s.setString("Java");
    System.out.println(s.append("Python"));
    s.append("Javascript").append("HTML").toString();

    StringBox s2 = new StringBox();
    s2.insert(3, "java");

    String s3 = StringBox.append("hello", " world").toString();
  }
}
