public class Keyboard {

  String buttonType;
  int noOfButton;

  public Keyboard(String buttonType, int noOfButton) {
    this.buttonType = buttonType;
    this.noOfButton = noOfButton;
  }

  public String getButtonType(String buttonType) {
    return this.buttonType;
  }

  public int noOfButton(int noOfButton) {
    return this.noOfButton;
  }

}
