class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("[^a-zA-Z0-9]"," ").toLowerCase();
        String st[] = paragraph.trim().split("\\s+");
        int n = st.length;
        int m = banned.length;
        HashSet<String> set = new HashSet<>();
        for (String p:banned){
            set.add(p.toLowerCase());
        }
        String ans = "";
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0;i<n;i++){
            map.put(st[i],map.getOrDefault(st[i],0)+1);
        }
        int max = 0;
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            if (!set.contains(entry.getKey()) && entry.getValue()>max){
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}