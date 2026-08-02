class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        int freq[] = new int[26];
        for (char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for (int i = 0;i<n;i++){
            if (freq[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}















/*class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> hs = new LinkedHashMap<>();
        int p = 0;
        for (char c:s.toCharArray()){
            hs.put(c,hs.getOrDefault(c,0)+1);
        }
        for (int i = 0;i<s.length();i++){
            if (hs.get(s.charAt(i)) == 1){
                p = i;
                break;
            }
            else {
                p = -1;
            }
        }
        return p;
    }
}*/