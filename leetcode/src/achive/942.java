public class 942{
//class Solution {
  public int[] diStringMatch(String s) {
        
     // 1 <= length <=100000
     // s = "I" or "D"
     // n>=0 so that first n != 0

    
   
     //int min = 0;
     //int max = s.length();
     Scanner s = new Scanner(System.in);
     int n = 1;
     int x = 1;
     for (int i = 0; i < s.length(); i++){
      if (s.charAt(i) == 'I'){
        n = n + x;
      } else if (s.charAt(i) == 'D'){
        n = n - x;
      }
     }

     int[] arr = new arr(){};

     return arr;


    }
}
