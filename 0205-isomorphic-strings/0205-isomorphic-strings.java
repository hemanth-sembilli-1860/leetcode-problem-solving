class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        HashMap<Character,Character> map = new HashMap<>();
        for (int i = 0;i<n;i++){
            char ch = s.charAt(i);
            char c = t.charAt(i);
            if (map.containsKey(ch) && map.get(ch)!=c){
                return false;
            }
            map.put(ch,c);
        }
        HashMap<Character,Character> Rmap = new HashMap<>();
        for (int i = 0;i<n;i++){
            char ch = s.charAt(i);
            char c = t.charAt(i);
            if (Rmap.containsKey(c) && Rmap.get(c)!=ch){
                return false;
            }
            Rmap.put(c,ch);
        }
        return true;
    }
}