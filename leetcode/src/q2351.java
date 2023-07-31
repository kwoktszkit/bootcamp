
public class q2351 {

  String s = "adfaa";

  int[] chs = new int[26];
  char ch = ' ';

  for(
  int i = 0;i<s.length();i++)
  {
    ch = s.charAt(i);

    if (++chs[ch - 'a'] == 2) {
      return ch;
    }

  }

}
