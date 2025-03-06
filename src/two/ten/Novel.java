package two.ten;

public class Novel implements Bookcase{
    @Override
    public void name() {
        System.out.println("실습 도서관");
    }

    @Override
    public void location() {
        System.out.println("분류번호 810");
    }

    @Override
    public void num() {
        System.out.println("세번째 책장");
    }

    @Override
    public void com() {
        System.out.println("두번째 칸");
    }

    public void happy() {
        System.out.println("당신은 소설을 읽어 행복해졌습니다.");
    }

}
