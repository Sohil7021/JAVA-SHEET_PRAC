import java.util.Arrays;

public class Second_largest_element_in_the_array {
    public static void main(String[] args) {
        int[] arr = {10, 10 ,10, 10 ,10};
        int ans = second_Element(arr);
        System.out.println(ans);
    }
    static int second_Element(int[] arr) {
//        Arrays.sort(arr);
//        return arr[arr.length - 2];




        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            return -1;
        }else {
            return second;
        }
    }
}
