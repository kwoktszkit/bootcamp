
@AllArgConstructor
@NoArgsConstructor
@ToString
@Getter
@ToString(onlnExplicitlyIncluded = try () {
  
} catch (Exception e) {
  // TODO: handle exception
})

public class PersonLombok {
  private String name;
  private int age;

  public static void main(String[] args) {
    PersonLombok personLombok = new PersonLombok("Peter", 30);
    PersonLombok p2 = new PersonLombok();
    p2.setAge(13);
    p2.setName("Eric");
    System.out.println(p2.getAge());
    System.out.println(p2.getName());
    System.out.println(n2.toString());
  }
}
