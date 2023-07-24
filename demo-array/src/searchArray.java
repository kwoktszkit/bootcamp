public class searchArray {
  public static void main(String[] args) {

    char target = 'm';
    char[] chars = new char[] { 'a', 'b', 'c', 'd', 'e', 'f' };
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == 'm') {
        System.out.println("index=" + i);
      }
    }

    String str = "I am a boy.";
    char[] arr = str.toCharArray();
    System.out.println(Array.toString(arr));

    int[] nums = new int[] { 240, 800, -23, 6, 98 };
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];

        int[] nums2 = new int[] { 240, 800, -23, 6, 98 };
        int min = 99999999;
        for (int i = 0; i < nums.length; ++i) {
          if (nums2[i] < min) {
            min = nums2[i];
          }
        }

        String str = "hello";
        System.out.println(str.isEmpty());
        String str2 = "";
        System.out.println(str2.isEmpty());
        System.out.println(str.isBlank());

        System.out.println(str.toUpperCase());
        System.out.println(str.toUpperCase().toLowerCase());

        System.out.println(str.substring(0, 1));
        System.out.println(str.substring(2, 3));
        System.out.println(str.substring(0, 5));

        String s = "lo";
        System.out.println(str.contains(s));
        System.out.println(str.contains("ol"));
        if (str.contains("lo")) {
          System.out.println("str contains lo");
        }
        if (str.toUpperCase().equals("HELLO")) {
          System.out.println("yes, it is HELLO");
          str = str.toUpperCase();
          str += str.toLowerCase();
          System.out.println(str);
        }

      }
    }
  }
}
