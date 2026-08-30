class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        int n = order.length();
        for (int i = 0;i<n;i++){
            map.put(order.charAt(i),i);
        }
        int m = words.length;
        for (int i = 0;i<m-1;i++){
            String ch = words[i];
            String c = words[i+1];
            for (int j = 0;j<Math.min(ch.length(),c.length());j++){
                if (ch.charAt(j)!=c.charAt(j)){
                if (map.get(ch.charAt(j))>map.get(c.charAt(j))){
                    return false;
                }
                break;
                }
            }
            if (ch.length()>c.length() && ch.startsWith(c)){
                return false;
            }
        }
        return true;
    }
}