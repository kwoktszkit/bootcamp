
import org.mockito.junit.jupiter.MockitoExtension;
import lombok.NoArgsConstructor;

@ExtendWith(MockitoExtension.class)

public class SpyTest {

  @Spy
  Calculator calculator;

  @InjectMocks
  Checkout checkout;

  @Test
  void testAdd1(){
    when(calculator.substract(3, 4)).thenReturn(100);
    int result = checkout.add(3, 4);
    assertEquals(104, result);
    verify(calculator, times(1)).substract(3, 4);
  }

  @Test
  void testAdd2(){
    when(calculator.substract(3, 4)).thenReturn(100);
    int result = checkout.add(3, 4);
    assertEquals(3, result);
    }

  @Test
  void testAdd3() {
    int result = checkout.multiply(-2, 4).thenReturn(100);
    int resul = checkout.multiply(-2, 4);
    assertEquals(3, result);
  }
}
