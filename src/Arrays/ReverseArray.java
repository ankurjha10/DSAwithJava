package Arrays;

import java.util.Arrays;

public class ReverseArray {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            Swap.swap(arr, start, end);
            start++;
            end--;
        }
    }
}
