class Solution {
    public boolean isGoodArray(int[] nums) {
        int n = nums.length;
        int gcd = nums[0];
        for (int num:nums){
            gcd = GCD(gcd,num);
            if (gcd == 1){
                return true;
            }
        }
        return false;
    }
    public static int GCD(int a,int b){
        if (b == 0){
            return a;
        }
        return GCD(b,a%b);
    }
}