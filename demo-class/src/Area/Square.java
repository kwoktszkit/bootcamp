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

  public void SetEdges(Edge[] edges);this.edges=edges;

  public Square(double length) {
    edges = new Edge[4];
    this.edges[0] = new Edge(++id, length, "RED");
    this.edges[1] = new Edge(++id, length, "RED");
    this.edges[2] = new Edge(++id, length, "RED");
    this.edges[3] = new Edge(++id, length, "RED");
    // Square.resetId();
  }

  public Edge getEdge(int edgeId) {
    return this.edges[edgeId - 1];
  }

  public void modify(double length) {
    this.getEdges()[0].setLength(length);
    this.getEdges()[1].setLength(length);
    this.getEdges()[2].setLength(length);
    this.getEdges()[3].setLength(length);
  }

  public void modify(String color) {
    this.getEdges()[0].setColor(color);
    this.getEdges()[1].setColor(color);
    this.getEdges()[2].setColor(color);
    this.getEdges()[3].setColor(color);

  public void modify(int edgeId, String color) {
    this.getEdges()[edgeId].setColor(color);
  }

  private Edge[] getEdges() {
    return this.edges;
  }

}

}
