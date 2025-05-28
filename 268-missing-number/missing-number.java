class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        // if(n == 1 && ){
        //     return 0;
        // }
        if(nums[n-1] != n){
            return n;
        }
        if(nums[0] != 0){
            return 0;
        }
        for(int i = 0 ; i < n-1 ; i++){
            if(nums[i] + 1 != nums[i+1]){
                return nums[i] + 1;
            }
        }
        return n;
    }
}