class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int freq[] = new int[101];
        int a[] = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i<n;i++){
           freq[nums[i]]++;
        }
        for (int i = 0;i<n;){
            for (int j=0;j<101;j++){
                if (freq[j]>0){
                    a[i++] = j;
                    freq[j]--;
                }
            }
        }
        return a;
    }
}