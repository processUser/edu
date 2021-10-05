package others;
// ArrayList
public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        arr = new int[0];
    }

    public void add(int val) {
        int[] tem = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++) {
            tem[i] = arr[i];
        }
        tem[arr.length] = val;
        arr = tem; // 주소값을 대입?(복사?)
    }

    public int size() {
        return arr.length;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i<arr.length; i++){
//            if(i == arr.length -1) {
//                System.out.printf("%d", arr[i]);
//            } else {
//                System.out.printf("%d, ", arr[i]);
//            }
            if(i != 0){
                System.out.print(", ");
            }

            System.out.printf("%d", arr[i]);

        }
        System.out.print("]");
    }
}
