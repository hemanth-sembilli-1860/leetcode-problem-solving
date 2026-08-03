class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        TreeMap<Integer,Integer> h1 = new TreeMap<>();
        for (int i = 0;i<m;i++){
            h1.put(nums1[i][0],nums1[i][1]);
        }
        for (int i = 0;i<n;i++){
            if (!h1.containsKey(nums2[i][0])){
                h1.put(nums2[i][0],nums2[i][1]);
            }
            else {
                h1.put(nums2[i][0],h1.get(nums2[i][0])+nums2[i][1]);
            }
        }
        int i = 0;
        int c[][] = new int[h1.size()][2];
        for (Integer j:h1.keySet()){
            c[i][0] = j;
            c[i][1] = h1.get(j);
            i++;
        }
        return c;
    }
}