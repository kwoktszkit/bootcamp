package hashset1;

import java.util.HashSet;

public class hashset1 {

  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("abc");
    strings.add("def");
    System.out.println(strings.size());
    boolean resul = strings.add("abc");
    strings.add("abc");
    System.out.println(strings.size());

    if (strings.add("def")) {
      System.out.println("def is added");
    } else {
      System.out.println("def is not added");
    }

    HashSet<Coordinate> coordinates = new HashSet<>();
    Coordinate c1 = new Coordinate(1, 1);
    Coordinate c2 = new Coordinate(1, 1);
    coordinates.add(c1);
    coordinates.add(c2);
    System.out.println(coordinates.size());

    Coordinate c3 = new Coordinate(2, 1);

    HashSet<Book> books = new HashSet();
    books.add(new Book());
    books.add(new Book());

  }
}
