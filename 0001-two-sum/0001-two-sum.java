class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l =0;
        int r = l+1;
        
        for(l=0;  l<nums.length-1; l++) {
            for(r=l+1; r<nums.length; r++){
                if(nums[l] + nums[r] == target) return new int[]{l , r};
            }
        }
        
        
        return new int[]{-1,-1};
    }
}