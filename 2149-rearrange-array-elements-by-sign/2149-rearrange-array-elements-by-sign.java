class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int c[] = new int[n];
        int j = 0;
        for (int i = 0;i<n;i++){
            if (nums[i] > 0){
                c[j] = nums[i];
                j = j+2;
            }
        }
        int k = 1;
        for (int i = 0;i<n;i++){
            if (nums[i]<0){
                c[k] = nums[i];
                k = k+2;
            }
        }
        return c;
    }
}