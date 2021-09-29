package ch03;

public class OperatorExample4 {
    public static void main(String[] args) {
        int n1 = 10;
        n1++; // 증감식
        ++n1;
        System.out.println(n1);
        n1--;
        System.out.println(n1);
        System.out.println();

        int n2 = 40;
        System.out.println(n2++);
        System.out.println(n2);
        System.out.println();

        int n3 = 50;
        n3 = n3 + 2; // 2씩 값 증가.
        n3 = n3 + 2; // 곱하기, 나누기도 된다.
        System.out.println(n3);
        System.out.println();

        int n4 = 50;
        n4 += 2; // n3 를 간단하게? 줄여서? 사용한 것.
        n4 += 2;
        System.out.println(n4);
    }
}
