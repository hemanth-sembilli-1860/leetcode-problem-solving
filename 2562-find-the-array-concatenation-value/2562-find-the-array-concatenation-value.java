class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        long res = 0;
        while (i<j){
            int digits = String.valueOf(nums[j]).length();
            long concat = (long)(nums[i])*(long)Math.pow(10,digits)+nums[j];
            res += concat;
            i++;
            j--;
        }
        if (i == j){
            res += nums[i];
        }
        return res;
    }
}