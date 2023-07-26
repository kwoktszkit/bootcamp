public class App {
    public static void main(String[] args) {
        StringBuilder strb = new StringBuilder("Hello");
        strb.append(" world");
        System.out.println(strb.toString());

        String s = "he ll o";
        String[] s2 = s.trim().replace('h', 'e').split(" ");

        StringBuilder s3 = new StringBuilder("start");
        System.out.println(s3.append('b').toString().charAt(0));

        String s10 = "insertindex";
        StringBuilder s11 = new StringBuilder("hello");
        s11.insert(3, ' ');
        System.out.println(s11);
        s11.insert(0, "head");
        System.out.println(s11);

        System.out.println(s11.deleteCharAt(3).toString());

        Integer a = 10;
        System.out.println(a + 10);

        s11.setCharAt(4, 'X');
        System.out.println(s11);
    }
}
