@AllArgsConstructor
// @NoArgsConstructor
@RequiredArgsConstructor

public class Car {

  @NonNull
  private Integer capacity;
  private String color;
  private final double weight;

  public Car(String color) {
    this.color = color;
    this.weigth = 0.0;
  }

  public static void main(String[] args) {
    Car car = new Car(3, 5.0);
  }

}
