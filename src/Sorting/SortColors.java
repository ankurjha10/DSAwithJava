package Sorting;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums){
        int low = 0, mid = 0, high = nums.length - 1;

        while(mid <= high){
            if (nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }
            if (nums[mid] == 1){
                mid++;
            }
            if (nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
            }
            if (mid > high)
                break;
        }
    }

    public static void sortColorsByBubbleSort(int[] nums){
        boolean swapped;

        for (int i = 0; i < nums.length - 1; i++){
            swapped = false;
            for (int j = 1; j < nums.length - i; j++){
                if (nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }
}
