package two.six;

public class Air implements Base{

    @Override
    public void turnOn() {
        System.out.println("에어컨 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("에어컨 전원을 끕니다.");
    }

    void temUp(){
        System.out.println("에어컨 온도를 높입니다.");
    }

    void temDown(){
        System.out.println("에어컨 온도를 낮춥니다.");
    }
}
