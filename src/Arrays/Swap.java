package Arrays;


import java.util.Arrays;

public class Swap {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(swap(arr, 1, 4)));
    }

    static int[] swap(int[] arr, int index1, int index2){
        if (arr.length == 0)
            return new int[]{0};

        int temp;

        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        return arr;
    }
}
