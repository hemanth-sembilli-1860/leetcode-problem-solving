class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans = 0,start = -1;
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while (map.get(nums[i])>k){
                start++;
                map.put(nums[start],map.get(nums[start])-1);
            }
            ans = Math.max(ans,i-start);
        }
        return ans;
    }
}