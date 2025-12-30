package DynamicProgramming;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        boolean answer = subSetCheck(arr,sum);
        System.out.println("Sum of Subset answer is: " + answer); 
    }
    static boolean subSetCheck(int[] arr, int sum){
        boolean[] dp = new boolean[sum+1];
        dp[0] = true;

        for(int num : arr){
            for(int j = sum; j >= num; j--){
                dp[j] = dp[j] || dp[j - num];
            }
        }
        return dp[sum]; 
    }
}
