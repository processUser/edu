package ch07;
// 부모클레스
public class CellPhone extends Object {
    String model;
    String color;

    public CellPhone() {
//        super(); // this() 사용시, super() 는 한번만 사용.
//        this.model = "노트10";
//        this.color = "white";
        this("노트10", "white");  //다른 같은 생성자를 호출할때 사용
    };
    public CellPhone(String model, String color) {
        super();
        this.model = model;
        this.color = color;
    }
    void powerON() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }
    void printInfo() {
        System.out.printf("model : %s, color : %s\n", model, color);
    }
    void sendMsg(String msg) {
        System.out.println("보낸 메시지 : " + msg);
    }
}
/*
생성자 쓰는 이유
은닉화, 캡슐화!!
멤버필드는 숨겨져있음 (값을 바로 넣을 수 없음)

객체에 은닉화 된 멤버필드에 값을 넣을 수 있는 방법 2가지...
1. setter 메소드 이용해서 객체에 값을 넣을 수 있음. // 여러번 가능.
2. 생성자를 이용해서 객체에 값을 넣을 수 있음.. // 한번만 가능.

객체에 은닉화 된 멤버필드에 값을 빼내는 방법 1가지...
1. getter 메소드 이용해서 객체에 값을 빼낸다.

 */
/*
final 키워드

클래스 - 상속이 안됨.
멤버필드 - 상수
메서드 - 오버라이딩 안됨.
 */