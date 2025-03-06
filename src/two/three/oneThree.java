package two.three;

public class oneThree {
    public static void main(String[] args) {
        int num = 100_000_000;

        long startGibon = System.nanoTime();
        double sum1 = 0.0;
        for (int i = 0; i < num; i++) {
            sum1 += i * 0.1;
        }
        long endGibon = System.nanoTime();
        long minGibon = endGibon - startGibon;

        long startMade = System.nanoTime();
        Double madeDulble = new Double(0);
        for (double i = 0; i < num; i++) {
            madeDulble = new Double(madeDulble.value + i * 0.1);
        }
        long endMade = System.nanoTime();
        long minMade = endMade - startMade;

        System.out.println("기본형 연산 시간: " + minGibon);
        System.out.println("래퍼 클래스 연산 시간: " + minMade);
        System.out.println("시간 차이: " + (double) minMade / minGibon);
    }
}
