package one;

import java.util.Scanner;

public class oneEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 입력한 숫자의 구구단 출력하기
        System.out.print("출력할 구구단 단수를 입력하세요: ");
        int dan = scanner.nextInt();

        if (dan >= 2 && dan <= 9) {
            System.out.println(dan + "단");
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
        } else {
            System.out.println("2부터 9 사이의 숫자를 입력하세요.");
        }

        // 2. 2단부터 9단까지 구구단 출력하기
        for (int dan1 = 2; dan1 <= 9; dan1++){
            System.out.println(dan1 + "단");

            for (int i = 1; i <= 9; i++){
                System.out.println(dan1 + " x " + i + " = " + (dan1 * i));
            }
        }
    }
}