class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int n = nums.length;
        int freq[] = new int[51];
        for (int i:nums){
            freq[i]++;
        }
        int xor = 0;
        for (int i = 0;i<freq.length;i++){
            if (freq[i]==2){
                xor ^= i;
            }
        }
        return xor;
    }
}