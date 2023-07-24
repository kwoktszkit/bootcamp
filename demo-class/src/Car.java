public class Car {

  int noOfWheel;
  int capacity;
  String color;

  public Car() {
  }

  public Car(int noOfWheel, int capacity, String color) {
    this.noOfWheel = noOfWheel;
    this.capacity = capacity;
    this.color = color;
  }

  public void setnoOfWheel(int w) {
    this.noOfWheel = 4;
  }

  public void setcapacity(int p) {
    this.capacity = 5;
  }

  public void setcolor(String c) {
    this.color = "Grey";
  }

  public int getnoOfWheel() {
    return this.noOfWheel;
  }

  public int getcapacity() {
    return this.capacity;
  }

  public String getcolor() {
    return this.color;
  }

}
