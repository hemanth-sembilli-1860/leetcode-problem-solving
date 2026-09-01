class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()==1) {
                int k = entry.getKey();
                if (!map.containsKey(k-1) && !map.containsKey(k+1)){
                    ans.add(k);
                }
            }
        }
        return ans;
    }
}