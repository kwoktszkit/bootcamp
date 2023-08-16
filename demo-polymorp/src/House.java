public class House extends Building {

  private double capacity;

  public House() {

  }

  public House(double capacity) {
    this.capacity = capacity;
  }

  public double getCapacity() {
    return this.capacity;
  }

  @Override
  public void println() {
    System.out.println("I am house");
  }

  public void print(String s) {
    System.out.println("Overloading" + s);
  }

  public void buildingPring() {
    super.println();
  }
}