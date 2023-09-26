class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSumEndingHere = nums[0];
        int maxSumSoFar = nums[0];
        for(int i=1; i<nums.length; i++) {
            maxSumEndingHere = Math.max(nums[i], maxSumEndingHere + nums[i]);
            maxSumSoFar = Math.max(maxSumSoFar, maxSumEndingHere);
        }
        return maxSumSoFar;
    }
}