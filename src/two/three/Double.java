package two.three;

public class Double {
    double value;

    Double(double value) {
        this.value = value;
    }

    public void add(double num) {
        this.value +=num;
    }


    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
