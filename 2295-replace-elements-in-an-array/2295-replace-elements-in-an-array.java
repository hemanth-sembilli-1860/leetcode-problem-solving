class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int m = operations.length;
        for (int i = m-1;i>=0;i--){
            int old = operations[i][0];
            int newValue = operations[i][1];
            if (map.containsKey(newValue)){
                map.put(old,map.get(newValue));
            }
            else {
                map.put(old,newValue);
            }
        }
        for (int i = 0;i<n;i++){
            if (map.containsKey(nums[i])){
                nums[i] = map.get(nums[i]);
            }
            else {
                continue;
            }
        }
        return nums;
    }
}