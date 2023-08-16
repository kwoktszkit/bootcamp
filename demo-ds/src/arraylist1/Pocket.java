import java.util.ArrayList;
import java.util.Objects;

public class Pocket {

  ArrayList<Ball> balls;

  public Pocket() {
    this.balls = new ArrayList<>();
  }

  public boolean isFull() {
    return this.balls.size() >= 5;
  }

  public void removeFirstBall() {
    this.balls.remove(0);
  }

  public void add(Ball ball) {
    // this.balls.add(ball);
    // if (this.balls.size() > 5) {
    // this.balls.remove(0);
    // this.balls.add(ball);
    this.balls.add(ball);

  }

  public void remove(Ball ball) {
    this.balls.remove(ball);
  }

  public void remove(int ballId) {
    for (Ball b : this.balls) {
      if (b.getId() == ballId)
        this.balls.remove(b);
      return;
    }
  }

  public int getSize() {
    return this.balls.size();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (Ball b : this.balls) {
      sb.append(b.toString());
      sb.append(",");
    }
    sb.append("]");
    return sb.toString();

  }

  public int totalScore() {
    int sum = 0;
    for (Ball b : this.balls) {
      sum += b.getScore();
    }
    return sum;
  }

}
