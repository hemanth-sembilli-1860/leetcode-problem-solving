class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> res = new ArrayList<>();
        int n = words.length;
        HashMap<String,Integer> map = new HashMap<>();
        for (String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b)->{
            if (!a.getValue().equals(b.getValue())){
                return Integer.compare(b.getValue(),a.getValue());
            }
            else {
                return a.getKey().compareTo(b.getKey());
            }
        });
        pq.addAll(map.entrySet());
        for (int i = 0;i<k;i++){
            String key = pq.poll().getKey();
            res.add(key);
        }
        return res;
    }
}