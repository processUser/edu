package ch01;

public class VariableExample2 {
    public static void main(String[] args) {
        // 한 줄 주석
        /*
         여
         러
         줄
         주
         석
         */
        // 기본형 타입 변수 - 실수형
        float f;
        double d;
        // 리터럴 - 값 그 자체 ex) 10.1, 10 등등
        f = (float)10.1;
        f = 10.1f;
        d = 10.1;

        double d2 = f * f; // 자동형변환

        //double d2 = (double)(f * f); //원래 이렇게 써야됨.
        //float f2 = d * d; // 자동형변환 안 된다.
        float f2 = (float)(d * d); // 수동형변환 필요
        float f3 = (float)(d) * (float)(d);
    }
}
