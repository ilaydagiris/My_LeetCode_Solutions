class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum += nums[i];
        }

        double maxSum = currSum;

        for (int i = k; i < nums.length; i++) {
            currSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum / k;
    }
}
