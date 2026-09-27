class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for (int i = 0;i<n;i++){
            int key = groupSizes[i];
            if (!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            List<Integer> inner = map.get(key);
            inner.add(i);
            if (inner.size() == key){
                list.add(inner);
                map.put(key,new ArrayList<>());
            }
        }
        return list;
    }
}