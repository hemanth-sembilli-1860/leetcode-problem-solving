class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n = nums.length;
        long sum = 0;
        int i = 0;
        int j = n-1;
        while (i<j){
            int len = String.valueOf(nums[j]).length();
            int s = nums[i]*(int)Math.pow(10,len)+nums[j];
            sum += s;
            i++;
            j--;
        }
         if (i == j){
            sum += nums[i];
        }
        return sum;
    }
}