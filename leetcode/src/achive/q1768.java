package achive;

public class q1768 {

  String word1;
  String word2;

  int word1len = word1.length();
  int word2len = word2.length();
  int n = word1len > word2Len ? word1Len : word2Len;

  StringBuilder s = new StringBuilder();

  for(
  int i = 0;i<n;i++)
  {
    if (i < word1.length())
      s.append(word1.charAt(i));

    if (i < word2.length())
      s.append(word2.charAt(i));

  }

  return s.toString();

}
