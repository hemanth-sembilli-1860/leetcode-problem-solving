class Solution {
    public String removeStars(String s) {
        int n = s.length();
        int st = 0;
        int alp = 0;
        for (char c:s.toCharArray()){
            if (c == '*'){
                st++;
            }
            else {
                alp++;
            }
        }
        if (st == alp){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}