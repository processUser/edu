package ch04;

import java.util.Scanner;

public class WhileBreakTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0, num = 0;

        while (true) {
            System.out.println("숫자를 입력하세요 (정지 : 0) : ");
            num = scan.nextInt();
            sum += num;
            if(num == 0){ break; }
        }
        System.out.println("더한 수 : " + sum);

    }
}
