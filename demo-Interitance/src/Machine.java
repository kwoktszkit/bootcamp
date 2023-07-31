public class Machine {

  private double weight;

  public double getWeight() {
    return this.weight;
  }

  public void setWeight(double weigth) {
    this.weight = weight;
  }

  public void start() {
    System.out.println("machine setart");
  }

  public void stop() {
    System.out.println("maching stop");

  public static final String staticMethod(String x, String y) {
    return x + y;
  }

  public Machine produce(int code) {
    switch (code) {
      case 1:
        return new Machine();
      case 2:
        return new Laptop();
    }
    return new Machine();
  }

  public void stop(int code){
    boolean stopCondition = 3 > 2;


  }

public static void main(String[] args){
  //Machine machine1 = Machine.produce(1);
  //Machine machine = Machine.produce(2);
  if (stopC stopCondition){
    Machine.stop(1);
  }

}

}

}
