package calculator;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Double> results = new ArrayList<Double>();

    public double calculator(double num1, double num2, String sym) {
        double result = 0;

        switch (sym) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("분모는 0이 될 수 없습니다.");
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("잘못된 사칙연산 기호입니다.");
        }

        results.add(result);
        remove();
        return result;
    }


    public ArrayList<Double> getSave() {
        return results;
    }

    public void remove() {
        if (results.size() >= 6) {
            results.remove(0);
        }
    }

    public void reset() {
        results.clear();
    }
}
