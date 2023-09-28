public class JavaQuest5 {
  public static void main(String[] args) {

    /**
     * 
     * When target = 'c', the expected output:
     * We found 3 character c in the String.
     * 
     * When target = 'z', the expected output:
     * Not Found.
     */
    // Count the target of character in a String.
    // public class JavaQuest5 {

    String str = "Welcome to the coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic

    // Use a loop to count the target of character in a String.
    // code here
    int countc = 0;
    int countz = 0;

    for (int a = 0; a < str.length(); a++) {
      char ch = str.charAt(a);
      if (ch == 'c') {
        countc++;
      }
      if (ch == 'z') {
        countz++;
      }
    }
    // if found, print "We found 3 character c in the String."
    // if not found, print "Not Found."
    // code here
    if (countc > 0) {
      System.out.println("We found " + countc + "character c in the String");
    } else {
      System.out.println("C Not Found");
    }

    if (countz > 0) {
      System.out.println("We found " + countz + "character z in the String");
    } else {
      System.out.println("Z Not Found");
    }

  }
}
