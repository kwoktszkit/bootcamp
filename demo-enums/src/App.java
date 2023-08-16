public class App {
    public static void main(String[] args) {
        System.out.println(Direction.EAST.name());
        System.out.println(Direction.NORTH);

        Direction direction = Direction.EAST;
        System.out.println(EAST == Direction.NORTH);

        for (Direction d : Direction.values()) {
            ;
            System.out.println(d.name());
        }

        System.out.println(Direction.SOUTH.ordinal());
        System.out.println(Direction.EAST.ordinal());

    }
}