public class operator {
    public static void main(String[] args) {

        int a = 1;
        a = a + 1;
        a = a - 2; // 0

        int b = 10 / 5; // 2
        b = b * 3 + 5; // 11

        System.out.println("a append b =" + a + b);

        int x = 1;
        x = x + 1; // 2
        x++; // 3
        ++x; // 4
        x += 1; // 5
        System.out.println("x=" + x);

        int y = 10;
        y = y - 2; // 8
        y--; // 7
        --y; // 6
        y -= 1; // 5
        System.out.println("y=" + y);

        int w = 9;
        w *= 3; // 27

        int u = 81;
        u /= 9; // 9

        System.out.println("w *= 3 same as w = w * 3 = " + w);
        System.out.println("u /= 9 same as u = u / 9 = " + u);

        int m = 3;
        m++;
        int preIncrement = ++m;
        System.out.println("preincrement = " + preIncrement);

        int postIncrement = m++;
        System.out.println("postincrement = " + postIncrement);
        System.out.println("m = " + m);

        int n = -3;
        n--; // -4
        int preIncrement2 = --n; // -5
        System.out.println("preIncrement2 = " + preIncrement2);

        int postIncrement2 = n--; // -5
        System.out.println("postIncrement2 = " + postIncrement2);
        System.out.println("n = " + n); // -6

        String str = "hello";
        str += " world";
        System.out.println(str);

    }

}
