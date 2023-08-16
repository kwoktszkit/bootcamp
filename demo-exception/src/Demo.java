public class Demo {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Hello, World!");
            throw new CheckException();
        } catch (CheckException e) {

        }
        throw new CheckException();
    }
}
