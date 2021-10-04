package ch06;

public class CalcTest {
    public static void main(String[] args) {
        int result = StaticCalc.sum(10, 20);
        System.out.println("static sum : " + result);

        // Calc 에 있는 sum() 호출해서 결과물 받기
        Calc c = new Calc();
        c.n1 = 40;
        c.n2 = 10;
        int result2 = c.sum();
        System.out.println("instance sum : " + result2);
    }
}
