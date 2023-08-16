package comparator;

import java.util.Comparator;

public class SortByNumber implements Comparator<Paper> {

  @Override
  public int compare(Paer 01, Paper o2){
    return o2.size > o1.size ? 1:-1;
  }
}
