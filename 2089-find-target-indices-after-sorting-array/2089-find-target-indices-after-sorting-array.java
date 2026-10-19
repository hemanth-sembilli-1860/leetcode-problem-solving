class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int c1 = 0;
        int c2 = 0;
        for (int i:nums){
            if (i<target){
                c1++;
            }
            else if (i == target){
                c2++;
            }
        }
        for (int i = 0;i<c2;i++){
            list.add(c1+i);
        }
        return list;
    }
}