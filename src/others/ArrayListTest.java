package others;

//import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        //재네릭을 줘서 특정 값만 넣는것 가능
        List<Integer> list = new ArrayList(); // 상속관계, List 가 부모

        list.add(10);
        list.add(20);
        list.add(30);
//        list.remove(2);
        int removeVal = list.remove(2); // 0 번칸 지우기.
        System.out.println("removeVal : " + removeVal);

        for(int i=0; i<list.size(); i++) {
            System.out.printf("(%d) - %d\n", i, list.get(i)); // 값을 가져오는메서드
        }

//        MyArrayList myList = new MyArrayList();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        myList.print();
    }
}
