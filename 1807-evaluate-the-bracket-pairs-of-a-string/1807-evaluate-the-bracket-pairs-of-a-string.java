class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int n = s.length();
        Map<String,String> map = new HashMap<>();
        for (List<String> list:knowledge){
            map.put(list.get(0),list.get(1));
        }
        StringBuilder key = new StringBuilder();
        StringBuilder res = new StringBuilder();
        boolean addKey = false;
        for (int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if (ch == '('){
                addKey = true;
            }
            else if (ch == ')'){
                if (map.containsKey(key.toString())){
                    res.append(map.get(key.toString()));
                }
                else {
                    res.append('?');
                }
                addKey = false;
                key.setLength(0);
            }
            else if (addKey){
                key.append(ch);
            }
            else {
                res.append(ch);
            }
        }
        return res.toString();
    }
}