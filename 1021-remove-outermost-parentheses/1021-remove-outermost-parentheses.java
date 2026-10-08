class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int level = 0;
        StringBuilder sb = new StringBuilder();
        for (char c:s.toCharArray()){
            if (c == '('){
                if (level>0){
                sb.append(c);
            }
            level++;
            }else {
                level--;
                if (level>0){
                sb.append(c);
            }
            }
        }
        return sb.toString();
    }
}