package ApnaCollege.Arrays;
import java.util.Arrays;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 4, 9, 7 };
        maxSubArraySum(arr);
    }

    public static void maxSubArraySum(int[] arr) {
        int max = 0;
        int sum = 0;
        int[] maxArr = new int[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int j2 = i; j2 < j; j2++) {
                    System.out.print(arr[j2]+" ");
                    sum += arr[j2];
                }
                if (sum>max) {
                    max = sum;
                    for (int k = i; k < j; k++) {
                        maxArr[k] = arr[k];
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(max);
        Arrays.toString(maxArr);
    }
}
