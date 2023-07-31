package achive;

public class q2185 {

  String[] words = new String[] { "Pay", "attention", "at", "you", "." };
  String pref = "at";
  int count = 0;

  for(
  int i = 0;i<words.length();i++)
  {
    if (words[i].startsWith(pref)) {
      count++;
    }
  }return count;

}
