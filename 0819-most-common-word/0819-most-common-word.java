class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        String[] st = paragraph.split("[!?',;. ]+");
        int n = st.length;
        int m = banned.length;
        HashSet<String> set = new HashSet<>();
        for (String p:banned){
            set.add(p.toLowerCase());
        }
        String ans = "";
        HashMap<String,Integer> map = new HashMap<>();
        for (String k:st){
            if (!set.contains(k)){
                map.put(k,map.getOrDefault(k,0)+1);
            }
        }
        int max = 0;
        for (String word : map.keySet()) {
            if (map.get(word) > max) {
                max = map.get(word);
                ans = word;
            }
        }
        return ans;
    }
}