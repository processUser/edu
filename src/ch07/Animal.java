package ch07;

public abstract class Animal { //abstract는 추상클래스 객체화 불가.
    public void crying() {
        System.out.println("동물이 울다.");
    }
    /*
    class 키워드 왼쪽에 abstract 붙이면 추상클래스가 된다.
    추상 클래스가 되면 객체화 불가능

    추상메서드가 해당 클레스에 1개라도 존재하면 그 클레스는 추상클레스가 되어야한다.(필수)

    추상 메서드는 강제성이 있다.
    자식은 추상메서드를 꼭 구현(오버라이딩) 해야한다.
     */
    public abstract void eat(); // 추상메서드 {}(구현)을 하지 않는다.
}
