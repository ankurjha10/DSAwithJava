package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int[][] nums = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

        int[][] nums = new int[3][3];

        for (int i = 0; i<nums.length; i++){
            for (int j = 0; j<nums[i].length; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i<nums.length; i++){
            System.out.println(Arrays.toString(nums[i]));
        }
    }
}
