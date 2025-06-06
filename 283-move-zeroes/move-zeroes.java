class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0; // slow pointer tracks where to place the next non-zero

        // Step 1: Move all non-zero elements to the front
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                // Swap nums[slow] and nums[fast]
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++; // move slow to next zero
            }
        }
    }
}
