class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> map = new HashMap<>();
        int n = messages.length;
        for (int i = 0;i<n;i++){
            String p[] = messages[i].split(" ");
            int val = p.length;
            if (map.containsKey(senders[i])){
                map.put(senders[i],map.get(senders[i])+val);
            }
            else {
                map.put(senders[i],val);
            }
        }
        int max = Integer.MIN_VALUE;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if (entry.getValue()>max){
                max = entry.getValue();
            }
        }
        String ans = "";
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if (max == entry.getValue()){
                if (entry.getKey().compareTo(ans)>0){
                    ans = entry.getKey();
                }
            }
        }
        return ans;
    }
}