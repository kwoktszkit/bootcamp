public class Ball {

  Color color;

  public Ball(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  public static void main(String[] args) {
    Ball ball = new Ball(Color.RED);
    System.out.println(ball.getColor().name());
  }

  Object object = new Ball(Color.RED);object.hashCode();

  Color color = (((Ball)object).getColor());
  
  Class<?> clas = color.getClass();
  System.out.println(clas.getName());


  if (Color.BLUE instanceof Color){
    System.out.println("Color.BLUE is instance of Color");
  }

  Object o = 1 - 'a';
  System.out.println(o.getClass().getName());
  Object o2 = 'b';
  System.out.println(o2.getClass().getName());
  Object o3 = new Ball(Color.GREEN);
  System.out.println(o3.getCLass().getName());

  System.out.println(o3.getCLass(.getName()));
  System.out.println(clas.isEnum());
  System.out.println(clas.isEnum());
}
