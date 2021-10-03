package ch05;

public class MethodTest {
    public static void main(String[] args) {
        //printMyself("황장군", 17, 180.82f, 'A');

        int mon = (int)(Math.random() * 12) +1;
        printSeason(mon);
        System.out.println(mon);
    }

    public static void printMyself(String name, int age, float height, char bloodType){
        System.out.printf("%s의 키는 %.2f cm, 나이는 %d세 , 혈액형은 %c이다.", name, height, age, bloodType);
    }

    public static void printSeason(int a){
        if(0 < a && a <3 || 12 == a ){
            System.out.println("겨울");
        } else if(a < 6){
            System.out.println("봄");
        } else if(a < 9){
            System.out.println("여름");
        } else if(a < 12){
            System.out.println("가을");
        } else {
            System.out.println("알수없다!");
        }
    }
}
