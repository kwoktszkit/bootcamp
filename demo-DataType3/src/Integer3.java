public class Integer3 {

  public static void main(String[] args) {

    Integer i1 = 100;
    Integer i2 = 200;
    System.out.println(i1 == i2);
    i2 = 100;
    System.out.println(i1 == i2); // internal cache (-128 to 127)

    Integer i3 = 128;
    Integer i4 = 128;
    System.out.println(i3 == i4);

    i3 = 127;
    i4 = 127;
    System.out.println(i3 == i4);

    Byte b1 = 127;
    // Byte b2 = new Byte(127); // destroy internal cache

    Short sh1 = -30000;
    Short sh2 = -30000;
    System.out.println(sh1 == sh2); // no internal cache

    long lg1 = 99999999;
    long lg2 = 99999999;
    System.out.println(lg1 == lg2);

    Character c1 = '#';
    Character c2 = '#';
    Character c3 = 'Ϩ';
    Character c4 = 'Ϩ';
    System.out.println(c1 == c2);
    System.out.println(c3 == c4);

    Integer i7 = Integer.valueOf(127);
    Integer i8 = 127;
    System.out.println(i7 == i8);

    Integer i9 = Integer.valueOf(128); // internal cache only -128 to 127
    Integer i10 = 128;
    System.out.println(i9 == i10);

  }

}
