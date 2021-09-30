package ch04;

public class ForTest4 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++){ // 행
            for (int j = 2; j < 10; j++){ // 열
                System.out.printf("%d * %d = %d\t", j, i, j * i);
            }
            // \n 은 행변환 , \t tap 기능
            System.out.println();
        }
    }
}
