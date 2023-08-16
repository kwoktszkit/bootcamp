public class TwoDArr {
    public static void main(String[] args) {

        int[][][] arr3d = new int[1][2][3];
        int[][][][] arr4d = new int[1][2][3][4];

        Demo[][] demo = new Demo[2][2];
        demo[0][0] = new Demo();
        demo[0][1] = new Demo();
        demo[1][0] = new Demo();
        demo[1][1] = new Demo();

        for (int i = 0; i < demo.length; i++) {
            for (int j = 0; j < demo[0].length; j++) {
                System.out.println(demo[i][j].age);
            }
        }

        String[][] strings = new String[][] { { "abc", "def" }, { "xyz", "ijk" } };
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[0].length; j++) {
                System.out.println(strings[i][j]);
            }
        }
    }

}
