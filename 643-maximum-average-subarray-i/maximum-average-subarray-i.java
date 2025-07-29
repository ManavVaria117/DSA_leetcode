class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for(int i = 0 ; i < k ; i++){
            sum = sum + nums[i];
        }

        double maxSum = sum;

        for(int j = k ; j < nums.length ; j ++){
            sum = sum - nums[j - k] + nums[j];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum / k;

    }
}