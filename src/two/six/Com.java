package two.six;

public class Com implements Base{

    @Override
    public void turnOn() {
        System.out.println("컴퓨터 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("컴퓨터 전원을 끕니다.");
    }

    void steam(){
        System.out.println("Steam을 실행합니다.");
    }

    void discord(){
        System.out.println("Discord를 실행합니다.");
    }
}
