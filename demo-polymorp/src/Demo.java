public class Demo {
    public static void main(String[] args) {

        Building building = new House();

        building.println();

        building.print2();

        building.print3();

        House house = new House();
        house.print("hello");
        house.print();
        House house2 = new House(3.0d);

        long l1 = Long.valueOf(1L);

        Object obj = new Container();

        if (obj instanceof Container)
            ;

        Cube cube = (Cube) obj; // explicit downcast
        System.out.println("obj is instance of Cube");

        Object obj2 = new Cube();
        if (obj2 instanceof Container) {
            Container container = (Container) obj2;
            System.out.println("obj2 is instance of Container");
        }

        Container obj3 = new Clone();
        Cube cube2 = (Cube) obj3;
        Number number = Integer.valueOf(3);
        Double d1 = (Double) number;
    }
}
