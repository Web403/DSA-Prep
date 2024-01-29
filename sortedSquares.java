/**
 * sortedSquares
 */
public class sortedSquares {

    public static void main(String[] args) {
        int[] nums = { -5, -3, -2, -1 };
        int[] ans = sortedSquares(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums.length-1; i++) {
            System.out.println("i : " + i);
            for (int j = 0; j < nums.length - i - 1; j++) {
                   if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                   }
            }
        }
        return nums;
    }
}