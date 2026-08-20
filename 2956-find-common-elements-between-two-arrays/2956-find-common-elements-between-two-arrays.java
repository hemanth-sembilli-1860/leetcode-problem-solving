class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        HashSet<Integer> m1 = new HashSet<>();
        HashSet<Integer> m2 = new HashSet<>();
        for (int i:nums1){
            m1.add(i);
        }
        for (int i:nums2){
            m2.add(i);
        }
        int left = 0,right = 0;
        for (int i = 0;i<n1;i++){
            if (m2.contains(nums1[i])){
                left++;
            }
        }
        for (int i = 0;i<n2;i++){
            if (m1.contains(nums2[i])){
                right++;
            }
        }
        return new int[]{left,right};
    }
}