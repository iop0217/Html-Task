package one;

import java.util.Scanner;

public class oneFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        System.out.println("\n출력 결과");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}
