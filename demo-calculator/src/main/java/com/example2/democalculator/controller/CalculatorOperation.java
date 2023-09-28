import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorOperation {

    @GetMapping(value = "/strings")
    List<String> strings;

    @GetMapping(value = "/add")
    Integer add(@RequestParam(name = "x") int salary,
            @RequestParam(name = "y") int bonus,
            @RequestPara(name = "z", required = false, defaultValue = "100") String devide);

    @GetMapping(value = { "/substract/{x}/{y}/{z}", "/substract/{x}/{y}" })
    Integer substract(@PathVariable(name = "x") int salary,
            @PathVariable int y,
            @PathVariable(required = false) strings z);
}
