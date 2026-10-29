class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int left = 0;
        int right = n-1;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        while (left<right){
            max = Math.max(max,nums[left]+nums[right]);
            left++;
            right--;
        }
        return max;
    }
}

//2 3 4 4 5 6