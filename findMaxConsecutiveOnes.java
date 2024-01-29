class findMaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int temp_count = 0;
        for(int i=0; i<=nums.length - 1; i++){
            if(nums[i] == 1 ){
                temp_count = 0;
                for(int j = i; j<=nums.length - 1; j++){
                    if (nums[j] == 0) {
                        break;
                    }
                    i++;
                    temp_count++;
                }
            }
            if(count < temp_count){
                count = temp_count;
            }
        }
        return count;
    }
}