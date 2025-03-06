package two.six;

public class twoSix {
    public static void main(String[] args) {

        Tv tv = new Tv();
        Air air = new Air();
        Com com = new Com();

        System.out.println("퇴근 후 집에 도착했습니다.");
        air.turnOn();
        tv.turnOn();
        com.turnOn();

        System.out.println("\n가전제품을 조절합니다.");
        air.temDown();
        tv.soundUp();
        com.discord();
        tv.channel();
        com.steam();
        air.temUp();
        tv.soundDown();

        System.out.println("\n잘 준비를 합니다.");
        com.turnOff();
        tv.turnOff();
        air.turnOff();
    }
}
