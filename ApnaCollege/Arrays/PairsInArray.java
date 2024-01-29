package ApnaCollege.Arrays;

public class PairsInArray {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 8, 10 };
        pairsInArray(arr);
    }

    public static void pairsInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("(" + arr[i] + " " + arr[j] + ")");
            }
            System.out.println();
        }
    }
}
