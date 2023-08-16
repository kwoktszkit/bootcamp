public class Phone {
  private String number;
  private Color color;
  private double weight;

  public Phone(Builder builder) {
    this.number = builder.number;
    this.color = builder.color;
    this.weight = builder.weight;
  }

  private static Builder builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "[number=" + this.number + ",color=" + this.color + ",weight=" + this.weight;
  }

  public static class Builder {
    private String number;
    private Color color;
    private double weight;

    public Builder number(String number) {
      this.number = number;
      return this;
    }

    public Builder color(Color color) {
      this.number = number;
      return this;
    }

    public Builder weight(double weight) {
      this.number = number;
      return this;
    }

    public Phone build() {
      return new Phone(this);
    }

    public static void main(String[] args) {
      Phone phone = new Phone.Builder()
          .color(Color.GREY)
          .number("98765432")
          .weight(3.7d)
          .build();
      System.out.println(phone);
    }

    Phone phone2 = Phone.builder().build();
  }
}
