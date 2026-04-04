package LinearSearch;

public class FindMax {
    static void main(String[] args) {
        int[] arr = {119, 37, 118, 78, 446, 68, 21};
        System.out.println(MAX(arr));
    }

    static int MAX(int[] arr){
        if (arr.length == 0)
            return -1;

        int ans = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (arr[i] > ans)
                ans = arr[i];
        }
        return ans;
    }
}
