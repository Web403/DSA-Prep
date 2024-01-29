import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = { 3,2,2,3 };
        int val = 2;
        System.out.println(removeElement(arr, val));
    }

    public static int removeElement(int[] arr, int val) {
        int length = arr.length -1;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == val) {
                if (i != length) {
                    int temp = arr[length];
                    arr[length] = arr[i];
                    arr[i] = temp;
                    length--; 
                }else {
                    length--;
                }
            }
        }
        return length+1;
    }
}
