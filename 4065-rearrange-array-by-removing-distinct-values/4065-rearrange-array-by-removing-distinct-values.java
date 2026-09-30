class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int freq[] = new int[101];
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i<n;i++){
           freq[nums[i]]++;
        }
        for (int i = 0;i<n;i++){
            for (int j=0;j<101;j++){
                if (freq[j]>0){
                    list.add(j);
                    freq[j]--;
                }
            }
        }
        int a[] = list.stream().mapToInt(i->i).toArray();
        return a;
    }
}