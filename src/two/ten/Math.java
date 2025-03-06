package two.ten;

public class Math implements Bookcase {
    @Override
    public void name() {
        System.out.println("과제 도서관");
    }

    @Override
    public void location() {
        System.out.println("분류번호 410");
    }

    @Override
    public void num() {
        System.out.println("첫번째 책장");
    }

    @Override
    public void com() {
        System.out.println("다섯번째 칸");
    }
}
