class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> res = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
         for (int i : nums1) {
            set1.add(i);
        }

        for (int i : nums2) {
            set2.add(i);
        }
        for (int i:set1){
            if (set2.contains(i)){
                res.add(i);
            }
        }
        for (int i:set2){
            if (set1.contains(i)){
                res.add(i);
            }
        }
        int result[] = new int[res.size()];
        int j = 0;
        for (int i:res){
            result[j] = i;
            j++;
        }
        return result;
    }
}