import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceimpl implements CalculatorService {

  @Autowired
  @Qualifier(value = "arraylist")
  private List<String> strings;
  List<Strings> strings;

  @Override
  public int add(int x, int y) {
    return x + y;
  }

  @Override
  public int substract(int x, int y) {
    return x - y;
  }
}
