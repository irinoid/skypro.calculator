package skypro.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {


    public String showGreetings() {
        return "Добро пожаловать в калькулятор.";
    }

    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new CalcIllegalArgumentException();
        }
        return num1 / num2;
    }
}