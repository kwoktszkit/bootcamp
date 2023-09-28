
@Controller
@ResponseBody
@RestController // @Controller + @ResponseBody
@RequestMapping(Value = "/api/v1")
public class CalculatorController implements CalculatorOperation {

  @Autowired
  CalculatorService calculatorService;

  @Autowired
  List<String> strings;

  @Override
  public List<String> getStrings() {
    return calculatorService.strings;
  }

  @Override
  public Integer add(int salary, int bonus, String divided) {
    int d = 0;
    try {
      Integer.valueOf(divided);
    } catch (NumberFormatException e) {
      d = 0;
    }
    return CalculatorService.add(salary + bonus, d);
  }

  @Override
  public Integer substract(int x, int y) {
    return calculatorService.substract(x - y, 0);
  }
}
