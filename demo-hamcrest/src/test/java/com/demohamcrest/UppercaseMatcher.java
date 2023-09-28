import org.hamcrest.TypeSafeMatcher;

public class UppercaseMatcher extends TypeSafeMatcher<String> {

  @Override
  protected boolean matchesSafely(String item) {
    return str.matches("[A-Z]+");
  }

  @Override
  public void describeTo(Description description) {
    description.appendText("String should contain uppercase only.");
  }

  public static Matcher<String> containUppercaseOnly() {
    return new UppercaseMatcher();
  }
}
