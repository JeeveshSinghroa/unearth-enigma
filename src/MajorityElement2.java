class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0, n = nums.length;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        for(int num : nums) {
            if(cnt1 == 0 && num != el2) {
                cnt1 = 1;
                el1 = num;
            } else if(cnt2 == 0 && num != el1) {
                cnt2 = 1;
                el2 = num;
            } else if(num == el1) {
                cnt1++;
            } else if(num == el2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        List<Integer> ls = new ArrayList<>(); 
        cnt1 = 0; cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el1) cnt1++;
            if (nums[i] == el2) cnt2++;
        }

        int mini = (int)(n / 3) + 1;
        if (cnt1 >= mini) ls.add(el1);
        if (cnt2 >= mini) ls.add(el2);

        return ls;
    }
}