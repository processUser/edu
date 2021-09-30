package ch04;

public class BreakExample2 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            for(int z = 100; z < 110; z++) {
                if(z == 103){  //안쪽 for문 탈출
                    break;
                }
                System.out.printf("%d - %d\n", i, z);
            }
        }
        System.out.println("-------");
        OUT_FOR:  // 레이블(label)
        for(int i = 0; i < 10; i++) {
            for(int z = 100; z < 110; z++) {
                if(z == 103){  // 바깥 for문 탈출
                    break OUT_FOR;
                }
                System.out.printf("%d - %d\n", i, z);
            }
        }
    }
}
