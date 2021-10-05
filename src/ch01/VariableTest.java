package ch01;

public class VariableTest {
    public static void main(String[] args){
        /*
        1. 정수는 실수를 저장할 수 없다.
        2. 작은타입에서 큰타입으로는 자동형변환이 이뤄진다.(물론 수동도 가능)
        3. 큰타입에서 작은타입으로는 자동형변환이 안 된다.(무조건 수동으로 해야된다.)
         */
        int n1 = 10;
        int n2 = 3;
        double result = n1 / (double)n2;
        System.out.println("결과 : " + result);
    }
}
