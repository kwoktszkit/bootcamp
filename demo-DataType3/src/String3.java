public class String3 {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = "abc";
        String str3 = "abcd";

        System.out.println(str.equals(str3));
        System.out.println(str == str2); // same value, java literal pool to same object

        str = "abc123";
        System.out.println(str == str2);

        String temp = str;
        str = new String("abc123");
        System.out.println(temp == str); // same value, but string wont edit same one

    }
}
