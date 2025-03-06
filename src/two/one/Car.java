package two.one;

public class Car {
    String model;
    int age;
    String color;

    Car (String model, int age) {
        this.model = model;
        this.age = age;
    }

    int getAccelerate(int value1, int value2) {
        int accel = value1 + value2;
        return accel;
    }

    void setColor(String color) {
        this.color = color;
    }
}
