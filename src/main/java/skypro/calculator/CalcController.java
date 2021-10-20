package skypro.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    private final CalcCountService calcCount;

    public CalcController(CalcCountService calcCount) {
        this.calcCount = calcCount;
    }

    @GetMapping
    public String showGreetings() {
        return calcCount.showGreetings();
    }

    @GetMapping(path = "/plus")
    public String calcPlus(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return "Результат сложения: " + num1 + "+" + num2 + "=" + Integer.toString(calcCount.calcPlus(num1, num2));
    }

    @GetMapping(path = "/minus")
    public String calcMinus(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return "Результат вычитания: " + num1 + "-" + num2 + "=" + Integer.toString(calcCount.calcMinus(num1, num2));
    }

    @GetMapping(path = "/multiply")
    public String calcMultiply(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return "Результат умножения: " + num1 + "*" + num2 + "=" + Integer.toString(calcCount.calcMultiply(num1, num2));
    }

    @GetMapping(path = "/divide")
    public String calcDivide(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return "Результат деления: " + (calcCount.calcDivide(num1, num2));
    }
}
