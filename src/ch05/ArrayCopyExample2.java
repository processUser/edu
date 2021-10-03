package ch05;

public class ArrayCopyExample2 {
    public static void main(String[] args){
        int[] arr1 = {10, 20, 30};
        int[] arr2 = new int[arr1.length]; // arr1 과 같은 크기의 새로운 객체? 배열을 생성??

        System.out.println(arr1.hashCode());
        System.out.println(arr2.hashCode());

        //깊은 복사(deep copy) - 값을 복사
        // arr2 = arr1; // 이것은 얕은 복사 - 주소값을 복사
        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }

        for(int i = 0; i<arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println(arr1 == arr2); // false
    }
}
