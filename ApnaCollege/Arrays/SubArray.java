package ApnaCollege.Arrays;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 9, 5 };
        subArray(arr);
    }

    private static void subArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int j2 = i; j2 < j; j2++) {
                    System.out.print(arr[j2] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
