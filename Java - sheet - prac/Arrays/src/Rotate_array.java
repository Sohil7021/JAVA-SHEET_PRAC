import java.util.ArrayList;

public class Rotate_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotateArray(arr,2);
        for (int num : arr) {
            System.out.println(num);
        }
    }
    static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        ArrayList<Integer> roted = new ArrayList<>();

        for (int num : arr) {
            roted.add(num);
        }

        for (int i = 0; i < n ; i++) {
            arr[(i+k) % n] = roted.get(i);

        }
    }

}
