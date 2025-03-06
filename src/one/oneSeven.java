package one;

import java.util.Scanner;

public class oneSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("신호등 색상을 입력하세요: ");
        String light = scanner.nextLine();
        if (light.equals("초록불")) {
            System.out.println("건너세요.");
        } else if (light.equals("노란불")) {
            System.out.println("주의하세요.");
        } else if (light.equals("빨간불")) {
            System.out.println("멈추세요.");
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }
}