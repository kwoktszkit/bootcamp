import java.util.*;

public class StringBox2 {

  char[] string;

  public StringBox2() {

  }

  public StringBox2(char[] sources) {
    // this.string = new char[sources.length];
    // for (int i = 0; i < sources.length; i++) {
    // string[i] = sources[i];
    this.string = Arrays.copyOf(sources, sources.length);
  }

  public StringBox2 append(String s) {
    char[] res = new char[this.string.length + s.length()];
    int idx = 0;
    int j = 0;
    while (j < this.string.length) {
      res[idx] = this.string[j];
      idx++;
      j++;
    }

    j = 0;
    while (j < s.length()) {
      res[idx] = s.charAt(j);
      idx++;
      j++;
    }

    this.string = res;
    return this;
  }

  public String toString() {
    return String.valueOf(this.string);

  }

  }

  public static void main(String[] args) {
    char[] chars = new char[] { 'a', 'c', 'b' };
    StringBox2 box = new StringBox2(chars);

    chars[1] = 'x';
    System.out.println(String.valueOf(chars));

  }
}
