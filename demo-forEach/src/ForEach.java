public class ForEach {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      System.out.println("basic for-loop hello");
    }
  }

  int[] arr = new int[] {1, 2,3,4};

  for(
  int x:arr)
  {
    System.out.println("for-each: hello, x =" + x);
  }

  String[] strs = new String[] { "hello", "world" };for(
  String str:strs)
  {
    System.out.println("for-each:" + strs);
  }for(
  int i = 0;i<arr.length;i++)
  {
    if (i > arr.length / 2 - 1) {
      break;
    }
    System.out.println("for-each:hello");
    System.out.println("" + arr[i] + arr[arr.length - i - 1]);
  }

  Character[] chars = new Character[] { 'L', '!', ')' };for(
  Character c:chars)
  {
    System.out.println(c);
  }

  String s2 = "hello world ! I am Vincent";
  String[] strings = s2.split(" ");for(
  String s:strings)
  {
    System.out.println(s);
  }

  int spaceCount = 1;for(
  int j = 0;j<s2.length();j++)
  {
    if (s2.charAt(j) == ' ') {
      spaceCount++;
    }
  }

  int startIndx = 0;
  int idx = 0;
  String[] result = new String[spaceCount + 1];for(
  int k = 0;k<s2.length();k++)
  {
    if (s2.charAt(k) == ' ') {
      result[idx] = s2.substring(startIndx, k);
      idx++;
      startIndx = k + 1;
    } else if (k == s2.length() - 1) {
      result[idx] = s2.substring(startIndx, s2.length());
    }
  }System.out.println(Arrays.toString(result));

}}
