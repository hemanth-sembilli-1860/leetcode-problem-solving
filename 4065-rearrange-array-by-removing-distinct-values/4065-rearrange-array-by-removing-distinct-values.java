class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (int i = 0;i<n;i++){
            for (int j:map.keySet()){
                if (map.get(j)>0){
                    list.add(j);
                    map.put(j,map.get(j)-1);
                }
            }
        }
        int a[] = list.stream().mapToInt(i->i).toArray();
        return a;
    }
}