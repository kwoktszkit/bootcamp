import java.util.Comparator;

public class Ball implements Comparable<Ball> {

  int id;
  Color color;

  public Ball(int id, Color color) {
    this.id = id;
    this.color = color;
  }

  @Override
  public int compareTo(Ball ball) {
    return ball.id > this.id ? 1 : -1;
  }

  @Override
  public String toString() {
    return "[id=" + this.id + ", color=" + this.color + "]";
  }
}
