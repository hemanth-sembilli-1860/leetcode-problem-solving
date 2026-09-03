class Solution {
    public String decodeMessage(String key, String message) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        int index = 0;
        for (int i = 0;i<key.length();i++) {
             char ch = key.charAt(i);
            if (ch != ' ' && !map.containsKey(ch)) {
                map.put(ch, index);
                index++;
            }

            if (index == 26) {
                break;
            }
        }
        String abc = "abcdefghijklmnopqrstuvwxyz";
       StringBuilder sb = new StringBuilder(message);
        int n = message.length();
        for (int i = 0;i<n;i++){
            char ch = message.charAt(i);
            if (map.containsKey(ch)){
                sb.setCharAt(i,abc.charAt(map.get(ch)));
            }
            continue;
        }
        return sb.toString();
    }
}