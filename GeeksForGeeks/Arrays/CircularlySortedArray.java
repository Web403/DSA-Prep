package GeeksForGeeks.Arrays;

public class CircularlySortedArray {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        System.out.println(checkCircularSorted(arr));
    }

    public static boolean checkCircularSorted(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]) {
                count++;
            }
        }
        if (count == 1) {
            return true;
        } else{
            return false;
        }
    }
}