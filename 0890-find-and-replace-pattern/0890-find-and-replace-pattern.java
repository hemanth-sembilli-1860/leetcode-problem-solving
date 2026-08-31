class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        int n = words.length;
        for (int i = 0;i<n;i++){
            if (check(words[i],pattern)){
                list.add(words[i]);
            }
        }
        return list;
    }
    public static boolean check(String word,String pattern){
        int n = word.length();
        int m = pattern.length();
        if (n!=m){
            return false;
        }
        HashMap<Character,Character> map = new HashMap<>();
        for (int j = 0;j<word.length();j++){
            char c = word.charAt(j);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(pattern.charAt(j))){
                    return false;
                }
            }
            else {
                if (map.containsValue(pattern.charAt(j))){
                    return false;
                }
                    map.put(c,pattern.charAt(j));
            }
        }
        return true;
    }
}