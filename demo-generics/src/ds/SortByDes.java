package ds;

public class SortByDes implements Comparator<String> {

  @Override
  public int compare(String o1, String o2)
  return o2.charAt(0) > o1.charAt(0) ? 1 : -1;

}
