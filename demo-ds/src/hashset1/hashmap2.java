package hashset1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import hashset1.Book;

public class hashmap2 {

  public static void main(String[] args) {
    HashMap<Integer, Book> books = new HashMap<>();
    books.put(128, new Book("Eric"));
    books.put(128, new Book("Steve"));

    HashMap<Author, Book> bookMap = new HashMap<>();

    Author author1 = new Author("John", 0);
    Author author2 = new Author("John", 0);
    bookMap.put(author1, new Book("Book3"));
    bookMap.put(author2, new Book("Book4"));

    HashMap<Author, ArrayList<Book>> bookMap2 = new HashMap<>();
    ArrayList<Book> booklist1 = new ArrayList<>();
    booklist1.add(new Book("Book1"));
    booklist1.add(new Book("Book2"));
    ArrayList<Book> booklist2 = new ArrayList<>();
    booklist2.add(new Book("Book3"));
    booklist2.add(new Book("Book4"));

    bookMap2.put(author1, booklist1);
    bookMap2.put(author2, booklist2);

    for (Map.Entry<Author, ArrayList<Book>> author : bookMap2.entrySet()) {
      // System.out.println(author.getKey().name());
      for (Book book : author.getValue()) {
        System.out.println("Author Name:" + author.getKey().name +
            "Book Name: " + book.getName());
      }
    }

    for (Book book : bookMap2.get(new Author("John", 0))) {

    }

  }
}
