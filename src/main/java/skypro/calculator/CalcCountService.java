package skypro.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalcCountService {
    public String showGreetings() {
        return "Добро пожаловать в калькулятор.";
    }

    public int calcPlus(int num1, int num2) {
        return num1 + num2;
    }

    public int calcMinus(int num1, int num2) {
        return num1 - num2;
    }

    public int calcMultiply(int num1, int num2) {
        return num1 * num2;
    }

    public String calcDivide(int num1, int num2) {
        if (num2 != 0) {
            return num1 + "/" + num2 + "=" + Integer.toString(num1 / num2);
        } else {
            return "На ноль делить нельзя!";
        }
    }
}
