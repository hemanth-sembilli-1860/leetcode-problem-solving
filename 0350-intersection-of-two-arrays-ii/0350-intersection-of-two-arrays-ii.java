class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for (int i:nums1){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for (int i:nums2){
            map2.put(i,map2.getOrDefault(i,0)+1);
        }
        for (int num:map1.keySet()){
            if (map2.containsKey(num)){
                int count = Math.min(map1.get(num),map2.get(num));
                for (int i = 0;i<count;i++){
                    list.add(num);
                }
            }
        }
        int res[] = new int[list.size()];
        for (int i = 0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}