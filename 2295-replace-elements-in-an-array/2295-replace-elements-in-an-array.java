class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        int n = nums.length;
        int res[] = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        int m = operations.length;
        for (int i = m-1;i>=0;i--){
            int oldValue = operations[i][0];
            int newValue = operations[i][1];
            if (map.containsKey(newValue)){
                map.put(oldValue,map.get(newValue));
            }
            else {
                map.put(oldValue,newValue);
            }
        }
        for (int i = n-1;i>=0;i--){
            if (map.containsKey(nums[i])){
                res[i] = map.get(nums[i]);
            }
            else {
                res[i] = nums[i];
            }
        }
        return res;
    }
}