class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        for (int i : nums1){
            set1.add(i);
        }
        for (int i: nums2){
            set2.add(i);
        }
        for (int i : nums1){
            if (set2.contains(i)){
                return i;
            }
        }
        return -1;
    }
}