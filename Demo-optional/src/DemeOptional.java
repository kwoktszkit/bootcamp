import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DemeOptional {

  public static void main(String[] args) {
    
    Optional<Book> o = getBook();
    if (!o.isPresent()){
      o.ifPresent(e ->)
    }
    
    
    
    List<Book> books = new ArrayList<>();
    books.add(new Book("John"));
    books.add(new Book("Mary"));
    books.add(new Book("Peter"));

    Optional<Book> book = books.stream()
        .filter(b -> b.author.startsWith("T"))
        .findAny();

    book.ifPresent(e -> {
      System.out.println("Yes, present");
    });

    if (book.isPresent()) {
      System.out.println(book.get());
    } else {
      System.out.println("Not found");
    }

    Optional<Book> book2 = Optional.of(new Book("Eric"));
    // Optional<Book> book3 = Optional.of(null);
    Optional<Book> book4 = Optional.ofNullable(null);
    Optional<Book> book5 = Optional.ofNullable(new Book("Jenny"));
    Optional<Book> book6 = Optional.empty();

    Optional<Book> book7 = null;

    Book newBook = book6.orElse(new Book("Default"));

    public static Optional <Book> getBook(){
      return Optional.empty()
    }
  }
}
