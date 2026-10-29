class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0;i<n/2;i++){
            sum = (nums[i]+nums[n-i-1]);
            max = Math.max(max,sum);
        }
        return max;
    }
}

//2 3 4 4 5 6