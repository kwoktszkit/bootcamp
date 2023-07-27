package Area;

public class Square {

  private Edge[] edges;

  public Square() {
    edges = new Edge[4];
    edges[0] = new Edge(3.0d, "RED");
    edges[1] = new Edge(3.0d, "YELLOW");
    edges[2] = new Edge(3.0d, "BLACK");
    edges[3] = new Edge(3.0d, "BLUE");

  }

  public Square(double length) {
    edges = new Edge[4];
    edges[0] = new Edge(length, "RED");
    edges[1] = new Edge(length, "RED");
    edges[2] = new Edge(length, "RED");
    edges[3] = new Edge(length, "RED");
  }

  public Edge[] getEdges() {
    return this.edges;
  }

  public static void main(String[] args) {
    Square s1 = new Square();
    Square s2 = new Square();
    Square s3 = new Square();

    s1.getEdges()[0].setColor("YELLOW");
    System.out.println(s1.getEdges()[0].getColor());

  }

}
