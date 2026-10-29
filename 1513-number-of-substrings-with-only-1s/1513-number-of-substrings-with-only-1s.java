class Solution {
    public int numSub(String s) {
        int MOD = 1_000_000_007;
        int n = s.length();
        long c = 0;
        long ones = 0;
        for (int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if (ch == '1'){
                ones++;
                c = (c+ones)%MOD;
            }
            else {
                ones = 0;
            }
        }
        return (int)c;
    }
}