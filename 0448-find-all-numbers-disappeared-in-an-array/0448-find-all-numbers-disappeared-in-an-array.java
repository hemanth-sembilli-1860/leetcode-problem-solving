class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int num:nums){
            hs.add(num);
        }
        for (int i = 1;i<=n;i++){
            if (!hs.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}