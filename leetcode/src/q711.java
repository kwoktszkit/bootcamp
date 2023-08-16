public class q711 {

  String jewels = "aA";
  String stones = "aAAb";
  int numOfJew = 0;

  char[] chJew = jewels.toCharArray();
  char[] chSton = stones.toCharArray();

  for(
  int i = 0;i<chJew.length;i++)
  {
    for (int j = 0; j < chSton.length; j++) {
      if (chJew[i] == chSton[j])
        numOfJew++;
    }
  }

}
