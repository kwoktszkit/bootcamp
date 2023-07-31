package Area;

public class Edge {

  private double length;
  private String color;
  private int id;
  private static int counter;

  public Edge(double length, String color) {
    this.id = id;
    this.length = length;
    this.color = color;

  }

  public static void resetId() {
    counter = 0;
  }

  public void setLength(double length) {

  }

  public void setColor(String color) {
    this.color = color;
  }

  public void getColor(String color) {
    this.color = color;
  }

}
