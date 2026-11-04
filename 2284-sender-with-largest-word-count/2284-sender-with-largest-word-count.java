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
        int max = Integer.MIN_VALUE;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if (entry.getValue()>max){
                max = entry.getValue();
            }
        }
        String res = "";
        for (String s:map.keySet()){
            if (map.get(s) == max && s.compareTo(res)>0){
                res = s;
            }
        }
        return res;
    }
}