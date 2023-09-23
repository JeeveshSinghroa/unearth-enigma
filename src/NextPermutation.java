class NextPermutation {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            int l = 0;
            int r = n-1;
            while(l < r) {
                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
                l++;
                r--;
            }
            return;
        }

        for(int i=n-1; i>idx; i--) {
            if(nums[i] > nums[idx]) {
                int tmp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = tmp;
                break;
            }
        }

        int l = idx+1;
        int r = n-1;
        while(l < r) {
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }

        return;
    }
}