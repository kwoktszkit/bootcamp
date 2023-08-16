package Equall;

public class Ball {

  private String color;

  public Ball(String color) {
    this.color = color;
  }

  @Override
  public int hashCode() {

    return Objects.hash(this.color);

  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Ball))
      return false;
    Ball ball = (Ball) o;
    return ball.color.equals(this.color);
  }

  public static void main(String[] args) {
    Ball b1 = new Ball("Blue");
    Ball b2 = new Ball("Blue");

  }

}
