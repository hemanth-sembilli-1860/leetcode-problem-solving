class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        int n = s.length();
        int k = knowledge.size();
        for (int i = 0;i<k;i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
       StringBuilder sb = new StringBuilder(s);

        while (sb.indexOf("(") != -1) {
            int start = sb.indexOf("(");
            int end = sb.indexOf(")", start);
            String key = sb.substring(start + 1, end);
            if (map.containsKey(key)) {
                sb.replace(start, end + 1, map.get(key));
            } else {
                sb.replace(start, end + 1, "?");
            }
        }
        return sb.toString();
    }
}