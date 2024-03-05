public class Non_Decreasing_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        boolean ans = decrease(arr);
        System.out.println(ans);
    }
    static boolean decrease(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1 ; i++) {
            if (arr[i] > arr[i+1]) {
                return true;
            }
        }

        return false;
    }
}
