package ApnaCollege.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9 };
        reverseAnArray(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void reverseAnArray(int[] arr) {
        int first = 0, last = arr.length - 1;
        while(first<last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
}
