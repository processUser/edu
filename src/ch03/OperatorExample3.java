package ch03;

public class OperatorExample3 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 10;
        int n3 = 20;
        int n4 = 20;

        boolean result1 = n1 >= n2; // 결과값 : true
        boolean result2 = n3 > n4; // 결과값 : false

        System.out.println(result1 && result2);
        System.out.println(result1 || result2);

        // && 로 이루어질 경우 앞쪽에는 false 확률이 높은 것으로 배치.
        // || 로 이루어질 경우 앞쪽에 true 확률이 높은 것으로 배치.
    }
}
