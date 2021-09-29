package ch04;

public class IfTest {
    public static void main(String[] args) {
        int score = 85;

        //점수가 90점 이상이면 A 등급
        //점수가 80점 이상이면 B 등급
        //점수가 70점 이상이면 C 등급
        //70점 미만이면 D 등급

        //C등급 이상 7점이상 + 3점 이하 -

        //예) 98 점 A+ , 85점 B , 73점 C-

        // 방법 1
        if(score >= 90) {
            if(score >= 97){
                System.out.println("A+");
            } else if(score > 93){
                System.out.println("A");
            } else {
                System.out.println("A-");
            }
        } else if(score >= 80) {
            if(score >= 87){
                System.out.println("B+");
            } else if(score > 83){
                System.out.println("B");
            } else {
                System.out.println("B-");
            }
        }else if(score >= 70) {
            if(score >= 77){
                System.out.println("C+");
            } else if(score > 73){
                System.out.println("C");
            } else {
                System.out.println("C-");
            }
        } else {
            System.out.println("D");
        }
    }
}
