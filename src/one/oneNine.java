package one;

public class oneNine {
    public static void main(String[] args) {

        // 1. 배열에서 짝수 출력하기
        int[] arr = {3, 4, 7, 10, 15, 20};

        System.out.print("짝수: ");
        for (int a : arr) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            } else {
            }
        }

        // 2. 배열의 누접합 구하기
        int[] arr1 = {2, 5, 8};
        int sum = 0;

        for (int i : arr1) {
            sum += i;
        }
        System.out.println("누적합: " + sum);

        // 3. 2차원 배열에서 검은 돌 좌표 찾기
        boolean[][] board = {
                {true, false},
                {false, true}
        };

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                    System.out.println("검은 돌 위치: "+ i + "," + j);
                }
            }
        }
    }
}

