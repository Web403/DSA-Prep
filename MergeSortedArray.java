public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        merge(nums1, 3, nums2, 3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    //{ 1 , 2 , 2 , 3 , 5 , 6}

    public static void merge(int[] nums1, int i, int[] nums2, int j) {
        int[] arr = new int[i + j];
        for (int loop1 = 0; loop1 < nums1.length; loop1++) {
            for (int loop2 = 0; loop2 < nums2.length; loop2++) {
                System.out.println("loop1 : " + loop1 + " loop2 : " + loop2);
                if (nums1[loop1] != 0) {
                    if (nums1[loop1] <= nums2[loop2]) {
                        System.out.println("inside if");
                        arr[loop1] = nums1[loop1];
                        System.out.println(arr[loop1]);
                    } else if (nums2[loop2] < nums1[loop1]) {
                        System.out.println("inside else");
                        arr[loop1] = nums2[loop2];
                    }
                } 
            }
            if(nums2.length < j){
                arr[loop1] = nums2[loop1];
            }
        }
        for (int ii = 0; ii < arr.length; ii++) {
            System.out.print(arr[ii] + " ");
        }
        System.out.println();
    }
}
