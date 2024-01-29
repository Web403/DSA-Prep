import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int len = removeDuplicates(nums);
        System.out.println(len);
    }

    public static int removeDuplicates(int[] nums) {
        int length = 0;
        int size = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    for(int k = )
                    nums[size] = nums[j];
                    if (j < nums.length-1) {
                        nums[j] = nums[j+1];
                    }
                    i=j;
                    length++;
                    System.out.println(length + " " + nums[j] + " " + nums[i]);
                    System.out.println(Arrays.toString(nums));
                }
            }
        }
        return length;
    }
}
