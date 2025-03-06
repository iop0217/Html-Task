package two.six;

public class Tv implements Base {

    @Override
    public void turnOn() {
        System.out.println("TV 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 전원을 끕니다.");
    }

    void channel(){
        System.out.println("TV 채널을 변경합니다.");
    }

    void soundUp(){
        System.out.println("TV 볼륨을 높입니다.");
    }

    void soundDown(){
        System.out.println("TV 볼륨을 낮춥니다.");
    }
}
