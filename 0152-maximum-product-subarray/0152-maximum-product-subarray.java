class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int leftProd = 1;
        int rightProd = 1;
        for (int i = 0;i<n;i++){
            if (leftProd==0){
                leftProd = 1;
            }
            if (rightProd==0){
                rightProd = 1;
            }
            leftProd *= nums[i];
            rightProd *= nums[n-1-i];
            max = Math.max(max,Math.max(leftProd,rightProd));
        }
        return max;
    }
}