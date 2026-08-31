class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        int n = s.length();
        int m = t.length();
        if (n!=m){
            return false;
        }
        for (int i = 0;i<n;i++){
            char c = s.charAt(i);
            if (map.containsKey(c)){
                if (!map.get(c).equals(t.charAt(i)))
                return false;
            }
            else {
                if (map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(c,t.charAt(i));
            }
        }
        return true;
    }
}