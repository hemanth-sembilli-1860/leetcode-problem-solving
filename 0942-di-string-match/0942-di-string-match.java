class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int res[] = new int[n+1];
        int Inc = 0;
        int Dec = n;
        for (int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if (ch == 'I'){
                res[i] = Inc;
                Inc++;
            }
            else if (ch == 'D'){
                res[i] = Dec;
                Dec--;
            }
        }
        res[n] = Inc;
        return res;
    }
}