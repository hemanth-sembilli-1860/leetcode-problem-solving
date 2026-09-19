class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        int l = n/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue() == l){
                return entry.getKey();
            }
        }
        return -1;
    }
}