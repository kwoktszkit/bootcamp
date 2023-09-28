import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Staff {
  String name;

  public Staff(String name, Department department) {
    this.name = name;
    this.department = department;
  }

  public static void main(String[] args) {
    List<Staff> staffs = Arrays.asList(new Staff("Mary", new Department("HR")),
        new Staff("Peter", new Department("IT")),
        new Staff("Eric", new Department("IT")));
    staffs.stream()
        .collect(Collectors.groupingBy(staff -> staff.department));

    deptMap.forEach((dept, staffList) -> System.out.println(dept + " " + staffList));

    for(Staff staff : deptMap.get(new Department("IT")))


    Map<Boolean, Lis<Staff>> gradeMap = staffs.stream()
    .collect(Collectors.partitioningBy(staff -> staff.performance >= 60));

    gradeMap.entrySet().stream()
    .forEach(e -> System.out.println(e));
  }
}
