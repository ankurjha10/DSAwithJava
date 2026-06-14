package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {119, 37, 118, 78, 46, 68, 21};
        System.out.println(MIN(arr));
    }

    private static int MIN(int[] arr){
        if (arr.length == 0)
            return -1;

        int ans = arr[0];
        for(int i = 1; i<arr.length; i++){

            if (arr[i] < ans)
                ans = arr[i];
        }
        return ans;
    }
}
