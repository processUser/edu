package ch04;

import java.util.Scanner;

public class WhileTest {
    /*
    숫자를 입력하세요 (정지 : 0) : 14
    숫자를 입력하세요 (정지 : 0) : 10
    숫자를 입력하세요 (정지 : 0) : 0
    더한 수 : 24
     */
    public static void main(String[] args) {
        int sum = 0, num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 (정지 : 0) : ");
        num = scan.nextInt();

        while (num !=0 ) {
            sum += num;
            System.out.println("숫자를 입력하세요 (정지 : 0) : ");
            num = scan.nextInt();
        }
        System.out.println("더한 수 : " + sum);

    }
}
