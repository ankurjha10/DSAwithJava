package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
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

            //if you did not swap it means the array is already sorted
            if(!swapped)
                break;
        }
    }
}

