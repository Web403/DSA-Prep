package ApnaCollege.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9 };
        int target = 5;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
