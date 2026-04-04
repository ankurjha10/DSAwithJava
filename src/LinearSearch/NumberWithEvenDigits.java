package LinearSearch;

public class NumberWithEvenDigits {
    static void main(String[] args) {
        int[] nums = {555,901,482,1771};

        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums){
        int count = 0;

        for(int num : nums){
            if (even(num))
                count++;
        }

        return count;
    }

    //function to check a number contains even numbers of digit or not
    static boolean even(int num){


        if (digits(num)%2 == 0)
            return true;

        return false;
    }

    static int digits(int num){
        int count = 0;

        while (num>0){
            count++;
            num /= 10;
        }

        return count;
    }
}
