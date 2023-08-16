public interface Player {

  int calculateScore();

  public static void fillThePocket(Pocket pocket) {
    while (!pocket.isFull()) {
      pocket.add(Ball.random());
    }

  }
}