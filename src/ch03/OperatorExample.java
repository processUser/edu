package ch03;

public class OperatorExample {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;

        int result = n1 + n2; // 사칙연산자
        //System.out.println("n1 + n2 = " + result);
        //System.out.println(n1 + " + " + n2 + " = " + result);
        System.out.printf("%d + %d = %d\n", n1, n2, result);

        result = n1 + -n2; // -n2 는 단항 연산자
        System.out.printf("%d + -%d = %d\n", n1, n2, result);

        boolean result2 = n1 > n2; // 비교연산자
        // 비교연산자 결과값은 항상 boolean 값이다.
        System.out.printf("%d > %d = %b\n", n1, n2, result2); // n1 은 n2 보다 초과
        System.out.printf("%d < %d = %b\n", n1, n2, n1 < n2); // n1 은 n2 보다 미만
        System.out.println();
        System.out.printf("%d >= %d = %b\n", n1, n2, n1 >= n2); // n1 은 n2 보다 이상
        System.out.printf("%d <= %d = %b\n", n1, n2, n1 <= n2); // n1 은 n2 보다 이하
        System.out.println();
        System.out.printf("%d == %d = %b\n", n1, n2, n1 == n2); // 같다
        System.out.printf("%d != %d = %b\n", n1, n2, n1 != n2); // 다르다

    }
}
