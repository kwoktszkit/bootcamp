package Objectt;

public class ObjectDemo {

  String name = "hello";

  @Override
  public String toString() {
    return this.name;
  }

  public static void main(String[] args) {

    ObjectDemo objectDemo = new ObjectDemo();
    objectDemo.hashCode();
  }

  String s1 = "abc";
  String s2 = "abc";
  System.out.println(s1.equals(s2));
 

}
