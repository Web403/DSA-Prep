public class FindNumberswithEvenNumberofDigits {

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println("ans : " + findNumbers(nums));
    }

    private static int findNumbers(int[] nums) {
        int count = 0 , even_nums = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            int num = nums[i];
            while (num != 0) {
                System.out.println(num);
                num = num / 10;
                count++;
            }
            System.out.println("count : " + count);
            if (count % 2 == 0) {
                even_nums++;
            }
        }
        return even_nums;
    }
    
}
