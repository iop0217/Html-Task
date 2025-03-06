package one;

import java.util.Scanner;

public class oneSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 산술 연산자 문제
        System.out.print("a에 들어갈 정수: ");
        int a = scanner.nextInt();
        System.out.print("b에 들어갈 정수: ");
        int b = scanner.nextInt();

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;

        System.out.println("덧셈 결과: " + c);
        System.out.println("뺄셈 결과: " + d);
        System.out.println("곱셈 결과: " + e);
        System.out.println("나눗셈 결과: " + f);
        System.out.println("나머지 결과: " + g);

        // 2. 비교 연산자 문제
        System.out.print("x에 들어갈 정수: ");
        int x = scanner.nextInt();
        System.out.print("y에 들어갈 정수: ");
        int y = scanner.nextInt();

        boolean big = x > y;
        boolean small = x < y;
        boolean same = x == y;
        boolean not = x != y;

        System.out.println("x가 y보다 큰가?: " + big);
        System.out.println("x가 y보다 작은가?: " + small);
        System.out.println("x와 y가 같은가?: " + same);
        System.out.println("x와 y가 다른가?: " + not);

        scanner.nextLine();

        // 3. 두 문자열이 같은지 비교
        System.out.print("첫 번째 문자열: ");
        String string1 = scanner.nextLine();
        System.out.print("두 번째 문자열: ");
        String string2 = scanner.nextLine();

        boolean string3 = string1.equals(string2);

        System.out.println("두 문자열이 같은가?: " + string3);
    }
}
