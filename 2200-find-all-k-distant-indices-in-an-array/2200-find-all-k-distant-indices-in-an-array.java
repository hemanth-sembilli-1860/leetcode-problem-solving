class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        int lastseen = -1;
        for (int j = 0;j<n;j++){
            if (nums[j] == key){
                int start = Math.max(0,j-k);
                int end = Math.min(n-1,j+k);
                start = Math.max(start,lastseen+1);
                for (int i = start;i<=end;i++){
                    res.add(i);
                    lastseen = i;
                }
            }
        }
        return res;
    }
}