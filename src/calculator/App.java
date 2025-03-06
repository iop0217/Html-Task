package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("계산기를 시작합니다.");
        System.out.println("'종료'를 입력하면 종료합니다.");
        System.out.println("'초기화'을 입력하면 계산기를 종료합니다.");
        System.out.println("'기록'을 입력하면 기록된 결과가 출력됩니다.");

        while (true) {
            System.out.print("첫 번째 정수를 입력하세요: ");
            String str1 = scanner.nextLine();
            if (str1.equals("종료")) {
                System.out.print("계산기를 종료합니다.");
                break;
            } else if (str1.equals("초기화")) {
                System.out.println("계산기를 초기화합니다.");
                calculator.reset();
                continue;
            } else if (str1.equals("기록")) {
                System.out.println("저장된 기록: " + calculator.getSave());
                continue;
            }
            double num1 = Double.parseDouble(str1);

            System.out.print("두 번째 정수를 입력하세요: ");
            String str2 = scanner.nextLine();
            if (str2.equals("종료")) {
                System.out.print("계산기를 종료합니다.");
                break;
            } else if (str2.equals("초기화")) {
                System.out.println("계산기를 초기화합니다.");
                calculator.reset();
                continue;
            } else if (str2.equals("기록")) {
                System.out.println("저장된 기록: " + calculator.getSave());
                continue;
            }
            double num2 = Double.parseDouble(str2);

            System.out.print("사칙연산 기호를 입력하세요: ");
            String sym = scanner.nextLine();
            if (sym.equals("종료")) {
                System.out.print("계산기를 종료합니다.");
                break;
            } else if (sym.equals("초기화")) {
                System.out.println("계산기를 초기화합니다.");
                calculator.reset();
                continue;
            } else if (sym.equals("기록")) {
                System.out.println("저장된 기록: " + calculator.getSave());
                continue;
            }

            double result = calculator.calculator(num1, num2, sym);
            System.out.println("결과: " + result);
        }
    }
}
