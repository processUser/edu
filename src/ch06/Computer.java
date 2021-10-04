package ch06;

public class Computer {
    static String brand;
    int cpu;

    public void print(){
        System.out.printf("컴퓨터 브랜드는 %s이고, cpu는 %d 이다.", brand, cpu);
    }
    public static void print2(){
        //System.out.printf("컴퓨터 브랜드는 %s이고, cpu는 %d 이다.", brand, cpu);
    }
}
