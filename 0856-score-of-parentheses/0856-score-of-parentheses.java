class Solution {
    public int scoreOfParentheses(String s) {
        int depth = 0;
        int score = 0;
        int n = s.length();
        for (int i = 0;i<n;i++){
            if (s.charAt(i) == '('){
                depth++;
            }
            else {
                depth--;
                if (s.charAt(i-1)=='(')
                    score += 1<<depth;
            }
        } 
        return score;
    }
}