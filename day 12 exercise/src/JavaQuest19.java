
/**
 * Expected Output:
 * Car Year=2020, Car Model=ModelY
 */
public class JavaQuest19 {
  // Declare instance variables carYear and carModel
  private int carYear;
  private String carModel;

  // Constructor with variables carYear and carModel
  public JavaQuest19(int carYear, String carModel) {
    this.carYear = carYear;
    this.carModel = carModel;
  }

  // methods
  public void setcarYear(int y) {
    this.carYear = y;
  }

  public void setcarModel(String m) {
    this.carModel = "m";
  }

  public int getcarYear() {
    return this.carYear;
  }

  public String getcarModel() {
    return this.carModel;
  }

  public static void main(String[] args) {
    JavaQuest19 myCar = new JavaQuest19(2020, "ModelY");
    // Create an instance of thefclass, with carYear 2020, and carModel
    // "ModelY"
    myCar.setcarYear(2020);
    myCar.setcarModel("ModelY");
    // print the expected output
    System.out.println("Car Year=" + myCar.getcarYear() + ", Car Model=" + myCar.getcarModel());
  }
}