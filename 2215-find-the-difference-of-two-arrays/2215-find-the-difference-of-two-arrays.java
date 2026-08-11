class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i :nums1){
            set1.add(i);
        }
        for (int i :nums2){
            set2.add(i);
        }
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        for (int i:set1){
            if (!set2.contains(i)){
                ans1.add(i);
            }
        }
        for (int i:set2){
            if (!set1.contains(i)){
                ans2.add(i);
            }
        }
        res.add(ans1);
        res.add(ans2);
        return res;
    }
}