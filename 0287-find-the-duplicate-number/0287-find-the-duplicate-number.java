class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int k = 0;
        for (int i:hm.keySet()){
            if (hm.get(i)>1){
                k = i;
            }
        }
        return k;
    }
}