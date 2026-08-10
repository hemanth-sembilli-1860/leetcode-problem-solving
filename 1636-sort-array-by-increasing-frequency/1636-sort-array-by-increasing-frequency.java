class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        int freq[] = new int[201];
        Integer res[] = new Integer[n];
        for (int num:nums){
            freq[num+100]++;
        }
        for (int i = 0;i<n;i++){
            res[i] = nums[i];
        }
        Arrays.sort(res,(a,b)->freq[a+100]==freq[b+100]?b-a:freq[a+100]-freq[b+100]);
        return Arrays.stream(res).mapToInt(Integer::intValue).toArray();
    }
}