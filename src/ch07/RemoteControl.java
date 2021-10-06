package ch07;

public interface RemoteControl { // 인터페이스는 객체화 불가
    public static final int MAX_VOLUME =10; // 생략 해도 public static final 자동으로 붙는다.
    int MIN_VOLUME =0;

    public abstract void turnOn(); //메서드는 public abstract 자동으로 붙는다.
    void turnOff();
    void volumeUp();
    void volumeDown();
}
