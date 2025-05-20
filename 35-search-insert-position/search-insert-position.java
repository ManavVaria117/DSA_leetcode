class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length - 1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target){
                return i;
            }
            if(nums[i] > target){
                return i;
            }
            if(nums[n] < target){
                return n+1;
            }
        }
        return 0;
    }
}