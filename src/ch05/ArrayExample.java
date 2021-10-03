package ch05;

public class ArrayExample {
    public static void main(String[] args) {
        // 배열(Array)
        /*
        같은 타입의 값을 여러개 저장할 때 유리하다.
        for문과 함께 이용하면 좋다.
         */

        int[] scores = {83, 90, 87, 100}; // int형 배열

        //변수.length
        for(int i = 0; i < scores.length; i++){
            System.out.println(scores[i]);
        }

    }
}
