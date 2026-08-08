class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int count = 0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        hs.put(0,1);
        for (int num:nums){
            sum += num;
            if (hs.containsKey(sum-k)){
                count += hs.get(sum-k);
            }
            hs.put(sum,hs.getOrDefault(sum,0)+1);
        }
        return count;
    }
}


 /*for (int i = 0;i<n;i++){
            int sum = 0;
            for (int j = i;j<n;j++){
                sum += nums[j];
                if (sum == k){
                    c++;
                }
            }
        }
        return c;*/