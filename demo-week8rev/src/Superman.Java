public class Superman implements Flyable{
  @Override
  public void fly(){
    System.out.println("I am flying");
  }
  public static void main(String[] args) {
    Flyable superman = new Superman();
    Flyable superman2 = new Flyable(){
      @Override
      public void fly(){
        System.out.println("I am flying");
      }
      Flyable superman3 = () -> System.out.println("I am flying");

      Optional<String> string = Optional.ofNullable("abc");
      int sum = 0;
      string.ifPresent( e -> {
      });

      int total = 0;
      if (String.isPresent()){
        total++;
      }

      Arrays.asList(1,2,3,4).stream()
      .forEach(e ->{
        .count();
      })

      public static double add(double a, double b){
        return BigDecimal.valueOf(a).add(BigDecimal.valueOf(b)).doublevalue();
      }
  }
}
