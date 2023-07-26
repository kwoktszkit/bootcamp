public class power {

  int[] base = new int[] { 0, -7, 3, 4 };
  int[] index = new int[] { 4, 5, -6, 0 };
  int[] result = new int[base.length];

  for(
  int i = 0;i<base.length;i++)
  {
    result[i] = (int) Math.pow(base[i], index[i]);
  }
}
