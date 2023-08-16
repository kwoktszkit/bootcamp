public class Animal {
  private int numOfLeg;
  private Breath breath;
  private boolean haveBackBone;

  public Animal(Builder builder) {
    this.numOfLeg = builder.numOfLeg;
    this.breath = builder.breath;
    this.haveBackBone = builder.haveBackBone;
  }

  private static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private int numOfLeg;
    private Breath breath;
    private boolean haveBackBone;

    public Builder numOfLeg(int numOfLeg) {
      this.numOfLeg = numOfLeg;
      return this;
    }

    public Builder breath(Breath breath) {
      this.breath = breath;
      return this;
    }

    public Builder haveBackBone(boolean haveBackBone) {
      this.haveBackBone = haveBackBone;
      return this;
    }

    public Animal build() {
      return new Animal(this);
    }

    public static void main(String[] args) {
      Animal turtle = new Animal.Builder()
          .numOfLeg(4)
          .breath(Breath.LUNGS)
          .haveBackBone(true)
          .build();
      System.out.println(turtle);

    }

  }

}
