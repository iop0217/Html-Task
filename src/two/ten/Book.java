package two.ten;

import javax.swing.*;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bookcase math = new Math();
        Bookcase novel = new Novel();

        System.out.print("찾으시는 책의 위치를 알려드립니다: ");
        String book = scanner.nextLine();

        if (book.equals("수학책")) {
            math.name();
            math.location();
            math.num();
            math.com();
        } else {
            System.out.println("과제를 위한 책이 맞는지 확인해주세요.");
        }

        System.out.println("당신은 과제를 하다가 소설책을 발견했습니다.");
        if (novel instanceof Novel) {
            Novel life = (Novel) novel;
            life.happy();
        } else {
            System.out.println("소설을 읽고 행복해지세요.");
        }
    }
}
