class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0;i<n;i++){
            hs.add(nums[i]);
        }
        int max = nums[0];
        int min = nums[0];
        for (int i = 0;i<n;i++){
            if (nums[i]>max){
                max = nums[i];
            }
            if (nums[i]<min){
                min = nums[i];
            }
        }
        for (int i = min;i<=max;i++){
            if (!hs.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}