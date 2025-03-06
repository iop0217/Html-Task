package two.one;

import java.util.Scanner;

public class twoOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car1 = new Car("Morning", 5);
        Car car2 = new Car("lambo", 2);

        int accel1 = car1.getAccelerate(50, 35);
        int accel2 = car2.getAccelerate(180, 100);
        System.out.println(car1.model + "의 속도: " + accel1);
        System.out.println(car2.model + "의 속도: " + accel2);

        car2.setColor("빨간색");
        System.out.println(car2.model + "의 색: " + car2.color);
    }
}
