public class SmallDog extends Dog {

  @Override
  public void jump() {
    super.addScore(5);
  }

  public static void main(String[] ags) {
    SmallDog smallDog = new SmallDog();

    smallDog.jump();
    System.out.println(smallDog.getScore());
    smallDog.up();
    System.out.println(smallDog.getScore());
  }

}
