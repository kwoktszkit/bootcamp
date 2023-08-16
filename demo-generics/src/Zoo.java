public class Zoo<T> {
  T animal;

  private Zoo(T animal) {
    this.animal = animal;
  }

  public static <T extends Animal> Zoo<T> of(T animal) {
    return new Zoo<>(animal);
  }

  public T getAnimal() {
    return this.animal;
  }

  public void setAnimal(T animal) {
    this.animal = animal;
  }

}
