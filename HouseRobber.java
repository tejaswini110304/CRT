public class HouseRobber {

    // DP array version (O(n) space)
    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[n - 1];
    }

    // Space optimized version (O(1) space)
    public static int robOptimized(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int prev1 = nums[0]; // dp[i-2]
        int prev2 = Math.max(nums[0], nums[1]); // dp[i-1]

        for (int i = 2; i < nums.length; i++) {
            int current = Math.max(prev2, prev1 + nums[i]);
            prev1 = prev2;
            prev2 = current;
        }

        return prev2;
    }

    public static void main(String[] args) {
        int[] houses = {2, 7, 9, 3, 1}; // Sample input

        System.out.println("Max money robbed (DP array): " + rob(houses));
        System.out.println("Max money robbed (Optimized): " + robOptimized(houses));
    }
}
