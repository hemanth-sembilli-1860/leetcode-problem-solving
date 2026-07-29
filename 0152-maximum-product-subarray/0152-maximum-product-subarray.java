class Solution {
    public int maxProduct(int[] nums) {
        int prod = 1;
        int maxProd = Integer.MIN_VALUE;
        int preprod = 1;
        int suffprod = 1;
        int n = nums.length;
        for (int i = 0;i<n;i++){
            if (preprod == 0){
                preprod = 1;
            }
            if (suffprod == 0){
                suffprod = 1;
            }
            preprod *= nums[i];
            suffprod *= nums[n-i-1];
            maxProd = Math.max(maxProd,Math.max(preprod,suffprod));
        }
        return maxProd;
    }
}