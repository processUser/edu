package ch07;

public class TelevisionTest {
    public static void main(String[] args) {
        Televison tv = new Televison();
        RemoteControl rc = tv; // rc 와 tv 차이는 메서드 호출 범위의 차이.
        tv.volumeState();

        for(int i = 0; i<100; i++){
            tv.volumeUp();
        }

        tv.volumeState();

        for(int i = 0; i<100; i++){
            tv.volumeDown();
        }

        tv.volumeState();
    }
}
