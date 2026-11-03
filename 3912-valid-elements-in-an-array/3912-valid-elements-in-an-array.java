class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        if (n == 1) return new ArrayList<>(List.of(nums[0]));
        int prefix[] = new int[n];
        prefix[0] = nums[0];
        int suffix[] = new int[n];
        suffix[n-1] = nums[n-1];
        for (int i=1;i<n;i++){
            prefix[i] = Math.max(prefix[i-1],nums[i]);
        }
        for (int i=n-2;i>=0;i--){
            suffix[i] = Math.max(suffix[i+1],nums[i]);
        }
        res.add(nums[0]);
        for (int i = 1;i<n-1;i++){
            if (nums[i]>prefix[i-1] || nums[i]>suffix[i+1]){
                res.add(nums[i]);
            }
        }
        res.add(nums[n-1]);
        return res;
    }
}