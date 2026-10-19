class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        int c = 0;
        int freq[] = new int[101];
        for (int i:nums){
            freq[i]++;
        }
        for (int i = 1;i<=100;i++){
            if (freq[i]!=3) continue;
            int first = -1;
            int second = -1;
            int third = -1;
            for (int j = 0;j<n;j++){
                if (nums[j] == i)
                if (first == -1){
                    first = j;
                }
                else if (second == -1){
                    second = j;
                }
                else if (third == -1){
                    third = j;
                }
            }
            if (second-first == third-second){
                c++;
            }
        }
        return c;
    }
}