class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int left_max[] = new int[n];
        int right_max[] = new int[n];
        left_max[0] = Integer.MIN_VALUE;
        right_max[n-1] = Integer.MIN_VALUE;
        for (int i = 1;i<n;i++){
            left_max[i] = Math.max(left_max[i-1],nums[i-1]);
        }
        for (int i = n-2;i>=0;i--){
            right_max[i] = Math.max(right_max[i+1],nums[i+1]);
        }
        for (int i = 0;i<n;i++){
            if (nums[i]>left_max[i] || nums[i]>right_max[i]){
                list.add(nums[i]);
            }
        }
        return list;
    }
}