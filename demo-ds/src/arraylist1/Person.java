public class Person implements Player {

  Pocket[] pockets;

  public Person() {

    pockets = new Pocket[2];
  }

  @Override
  public int totalScore() {
    return this.getLeftPocket().totalScore()
        + this.getRightPocket().totalScore();
  }

  public Pocket getLeftPocket() {
    return this.pockets[0];
  }

  public Pocket getRightPocket() {
    return this.pockets[1];
  }

  public static void fillThePocket(Pocket pocket) {
    while (!pocket.isFull()) {
      pocket.add(Ball.random());
    }

  }

  public static void main(String[] args) {
    Person p1 = new Person();
    Player.fillThePocket(p1.getLeftPocket());
    Player.fillThePocket(p1.getRightPocket());

    Person p2 = new Person();
  } m

}
