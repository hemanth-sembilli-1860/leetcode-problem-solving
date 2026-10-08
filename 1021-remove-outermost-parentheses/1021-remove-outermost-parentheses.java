class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
       Deque<Character> st = new ArrayDeque<>();
        for (int i = 0;i<n;i++){
            char c = s.charAt(i);
            if (c == ')'){
                st.pop();
            }
            if (!st.isEmpty()){
                sb.append(c);
            }
            if (c == '('){
                st.push(c);
            }
        }
        return sb.toString();
    }
}