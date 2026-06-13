package Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped;
        // run these steps n-1
        for(int i = 0; i < arr.length - 1; i++){
            //for each step, max item will come at the end
            swapped = false;
            for (int j = 1; j < arr.length - i; j++){
                // swap if the item is smaller than previous item
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            //if you did not swapped it means the array is already sorted
            if(!swapped)
                break;
        }
    }
}
