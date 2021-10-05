package ch07;

public class Dog extends Animal{
    @Override
    public void crying() {
        System.out.println("강아지가 멍멍");
    }

    @Override
    public void eat() {
        System.out.println("개는 무엇을 먹는다.");
    }
}
