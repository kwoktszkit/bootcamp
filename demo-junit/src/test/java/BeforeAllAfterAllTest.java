import org.junit.jupiter.api.Test;

@

public class BeforeAllAfterAllTest {

  private int x;

  @BeforeAll
  void beforeAll() {

  }

  @AfterAll
  void afterAll() {

  }

  @Test
  void test() {
    x++;
    assertTrue(x == 1);
  }

  @Test
  void test2() {
    x++;
assertTrue(x == 1);
  }

}
