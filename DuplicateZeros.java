public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void duplicateZeros(int[] arr) {
        for (int tracker = 0; tracker < arr.length; tracker++) {
            if (arr[tracker] == 0) {
                for (int j = arr.length - 1; j > tracker; j--) {
                    arr[j] = arr[j - 1];
                }
                tracker++;
            }
        }
    }
}
