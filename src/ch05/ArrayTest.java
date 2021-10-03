package ch05;

public class ArrayTest {
    public static void main(String[] args) {
        int[] scores = {100, 87, 56, 23, 28, 98, 30, 32};
        int sum=0;

        //점수가 짝수인 친구들만 점수 프린트,
        //점수가 홀수인 친구들의 합계점수 프린트

        for(int i = 0; i < scores.length; i++){
            if((scores[i] % 2) == 1){
                sum += scores[i];
            } else {
                System.out.println(scores[i]);
            }
        }
        System.out.println("홀수 의 합 : " + sum );
    }
}
