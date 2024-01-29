package ApnaCollege.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9 };
        int target = 5;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
