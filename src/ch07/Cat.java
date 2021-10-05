package ch07;

public class Cat extends Animal{ //abstract 을 붙이면 구현 안할 수 있다. Cat을 상속 받는 클레스에 강제성 부여.
    @Override
    public void crying() {
        System.out.println("고양이가 야옹야옹");
    }

    @Override
    public void eat() {
        System.out.println("고양이가 낼름낼름 먹는다.");
    }

}
