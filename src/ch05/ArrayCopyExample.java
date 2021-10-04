package ch05;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = arr1; // 얕은 복사 (shallow copy)

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr2[0] : " + arr2[0]);

        arr2[0] = 5;

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr2[0] : " + arr2[0]);

        System.out.println(arr1);
        System.out.println(arr1.hashCode()); // 대략적인 주소값을 볼 수있음.
        System.out.println(arr1 == arr2);
    }
}
