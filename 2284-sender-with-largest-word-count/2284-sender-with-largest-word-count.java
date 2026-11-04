class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        int n = messages.length;
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0;i<n;i++){
            String p[] = messages[i].split(" ");
            int l = p.length;
            if (!map.containsKey(senders[i])){
                map.put(senders[i],l);
            }
            else {
                map.put(senders[i],map.get(senders[i])+l);
            }
        }
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b)->{
            if (!a.getValue().equals(b.getValue())){
                return Integer.compare(b.getValue(),a.getValue());
            }
            else {
                return b.getKey().compareTo(a.getKey());
            }
        });
        pq.addAll(map.entrySet());
        return pq.poll().getKey();
    }
}