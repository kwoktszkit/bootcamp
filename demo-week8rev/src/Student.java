public class Student<T extends Number> {
  T data;

  public static void main(String[] args) {
    Student<Integer> student = new Student<>();
    Student.getThing(2);
  }

  public T getData() {
    return this.data;
  }

  public static <S> S getThing(S name) {
    return data;
  }
}
