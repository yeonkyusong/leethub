class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefixSum = new int[nums.length];


        for(int i = 1; i<nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }

        for(int pivot=0; pivot<nums.length; pivot++) {
            int leftSum = 0;
            int rightSum = 0;

            if(pivot == 0) leftSum = 0;
            else leftSum = nums[pivot-1];

            rightSum = nums[nums.length-1] - nums[pivot];
            
            if(leftSum == rightSum) return pivot;
        }
        
        return -1;
    }
}

// 0~피벗-1
// 피벗+1 ~ nums.length

// 1 8 11 17 22 28
//        p
// leftSum = prefixSum[pivot-1];
// rightSum = prefixSum[nums.length] - prefixSum[pivot];