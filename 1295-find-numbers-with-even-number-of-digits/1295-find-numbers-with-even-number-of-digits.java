class Solution {
    public int findNumbers(int[] nums) {
        int k = 0;
        int n = nums.length;
        for (int i = 0;i<n;i++){
            if (countDigs(nums[i])%2 == 0){
                k++;
            }
        }
        return k;
    }
    public static int countDigs(int n){
        int c = 0;
        while (n!=0){
            c++;
            n = n/10;
        }
        return c;
    }
}