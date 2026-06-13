package LinearSearch;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };

        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts){

        int max = 0;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int i : account) {
                wealth += i;
            }
            if (wealth > max) {
                max = wealth;
            }
        }
        return max;
    }
}
