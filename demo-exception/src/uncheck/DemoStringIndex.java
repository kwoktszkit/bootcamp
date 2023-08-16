package uncheck;

public enum DemoStringIndex {
  public static void main(String[] args) {
    try{
      "abc".charAt(3);
    } catch(StringIdexOutOfBoundsException e){
      System.out.println("String idex issue");
    }
  }
  
}
