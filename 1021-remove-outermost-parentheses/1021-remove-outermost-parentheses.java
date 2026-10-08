class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int level = 0;
        StringBuilder sb = new StringBuilder();
        for (char c:s.toCharArray()){
            if (c == ')'){
                level--;
            }
            if (level>0){
                sb.append(c);
            }
            if (c == '('){
                level++;
            }
        }
        return sb.toString();
    }
}