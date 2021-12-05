package skypro.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    private final CalcServiceImpl calcCount;

    public CalcController(CalcServiceImpl calcCount) {
        this.calcCount = calcCount;
    }

    @GetMapping
    public String showGreetings() {
        return calcCount.showGreetings();
    }

    @GetMapping("/plus")
    public String calcPlus(@RequestParam int num1, @RequestParam int num2) {
        return "Результат сложения: " + num1 + "+" + num2 + "=" + calcCount.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String calcMinus(@RequestParam int num1, @RequestParam int num2) {
        return "Результат вычитания: " + num1 + "-" + num2 + "=" + calcCount.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String calcMultiply(@RequestParam int num1, @RequestParam int num2) {
        return "Результат умножения: " + num1 + "*" + num2 + "=" + calcCount.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String calcDivide(@RequestParam int num1, @RequestParam int num2) throws CalcIllegalArgumentException {

            return "Результат деления: " + calcCount.divide(num1, num2);

    }
}
