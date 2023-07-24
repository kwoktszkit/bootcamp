public class App {
    public static void main(String[] args) throws Exception {

        // upcasting(implicit conversion)
        // byte -> short -> int -> long -> float >
        byte b = 2;
        short s = b;
        int l = s;
        long i = l;
        float f = l;
        double d = f;
        char c = 'A';
        int j = c;

        // dwoncasting
        double d2 = 10.3d;
        // float f2 = d2;//
        float f2 = (float) d2;

        short s2 = 128;
        byte b2 = (byte) s2;

        for (byte k = 127; k < 129; k++) {
        }

        long[] arr = new long[Integer.MAX_VALUE];
        for (int n = 0; n < arr.length; n++) {
        }

        char c2 = 'B';
        char c3 = 67;

        int g = 'a';
        char k = (char) g;

        int h = (int) 1000L;

        char character = 'a' +1;
        if (character == 'b')
    }
}
