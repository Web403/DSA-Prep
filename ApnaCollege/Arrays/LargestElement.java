package ApnaCollege.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9 };
        int ans = largestElement(arr);
        System.out.println(ans);
    }

    public static int largestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }
}
