package skypro.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {


    public String showGreetings() {
        return "Добро пожаловать в калькулятор.";
    }

    public int Plus(int num1, int num2) {
        return num1 + num2;
    }

    public int Minus(int num1, int num2) {
        return num1 - num2;
    }

    public int Multiply(int num1, int num2) {
        return num1 * num2;
    }

    public String Divide(int num1, int num2) {

        return num1 + "/" + num2 + "=" + Integer.toString(num1 / num2);

    }
}
