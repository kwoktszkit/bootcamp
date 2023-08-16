import java.lang.reflect.Array;
import java.util.ArrayList;
import java.lang.Object.toString;

public class DemoArrayList {

  public static void main(String[] args) {

    int[] arr = new int[] { 1, 3, 2 };
    Integer[] integers = new Integer[] { 1, 3, 2 };

    integers = new Integer[] { 1, 3, 2, 4 };

    ArrayList<Integer> numbers;
    numbers = new ArrayList<>();

    ArrayList<Integer> numbers2 = new ArrayList<>();
    numbers2.add(1);
    numbers2.add(3);
    numbers2.add(2);
    numbers2.add(4);
    numbers2.add(null);

    Integer[] arr2 = new Integer[numbers2.size()];
    arr2 = numbers.toArray(arr2);
    System.out.println(Array.toString(arr2));

    for (int i = 0; i < numbers2.size(); i++) {
      System.out.println(numbers2.get(i));
    }

    int original = numbers2.set(2, 100);
    System.out.println("original=" + original);

    System.out.println(numbers2.isEmpty());
    System.out.println(numbers2.size() == 0);

    ArrayList<Integer> numbers3 = new ArrayList<>();
    numbers3.add(1000);
    numbers3.add(2000);

    numbers2.addAll(numbers3);
    System.out.println(numbers2.size());

    numbers2.remove(2);
    System.out.println(numbers2.size());

    numbers2.removeAll(numbers3);
    System.out.println(numbers2.size());

    numbers2.indexOf(1000);
    numbers2.indexOf(3);

    System.out.println(numbers2.contains(3));
    System.out.println(numbers2.contains(900));
    System.out.println(numbers2.containsAll(numbers3));

    System.out.println(numbers2.lastIndexOf(4));

    numbers2.add(1, 4);

    numbers2.clear();
    System.out.println(numbers2.size());

  }
}
