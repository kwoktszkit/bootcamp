package Equall;

public class Animall {

  private boolean haveBackBone;
  private boolean useMilkFeedBaby;
  private int numOfLegs;
  private double averageLifeYear;

  public Animall(boolean haveBackBone, boolean useMilkFeedBaby, int numOfLegs, double averageLifeYear) {
    this.haveBackBone = haveBackBone;
    this.useMilkFeedBaby = useMilkFeedBaby;
    this.numOfLegs = numOfLegs;
    this.averageLifeYear = averageLifeYear;
  }

  @Override
  public boolean equals(Object a) {
    if (this == a)
      return true;
    if (!(a instanceof Animall))
      return false;
    Animall animal = (Animall) a;
    return animal.haveBackBone == this.haveBackBone && animal.useMilkFeedBaby == this.useMilkFeedBaby;
  }

  public static void main(String[] args) {
    Animall human = new Animall(true, true, 2, 80.5d);
    Animall whale = new Animall(true, true, 0, 75.5d);
    Animall bird = new Animall(true, false, 2, 10.0d);
    Animall octopus = new Animall(false, false, 8, 4d);

    System.out.println("In view of some mammalia charachistics, human and whale are equal? " + human.equals(whale));
    System.out.println("In view of some mammalia charachistics, bird and octopus are equal? " + bird.equals(octopus));
  }
}