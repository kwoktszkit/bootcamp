public enum Direction {

  EAST('E', 90),
  SOUTH('S', 180),
  WEST('W', 270),
  NORTH('N', 360),
  ;

  private char direction;
  private int degree;

  private Direction(char direction, int degree) {
    this.direction = direction;
    this.degree = degree;
  }

  public char getDirection() {
    return this.direction;
  }

  public int getDegree() {
    return this.degree;
  }

  public boolean isOpposite(Direction direction) {
    return Math.abs(this.degree - direction.getDegree()) == 180;
  }

  public static void main(String[] args) {
    System.out.println(Direction.EAST.isOpposite(Direction.WEST));

  }

}
