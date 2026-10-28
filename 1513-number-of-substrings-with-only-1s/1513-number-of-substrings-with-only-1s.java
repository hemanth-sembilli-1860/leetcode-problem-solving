class Solution {
    public int numSub(String s) {
        long c = 0;
        int MOD = 1_000_000_007;
        long ones = 0;
        int n = s.length();
        for (int i = 0;i<n;i++){
            if (s.charAt(i) == '1'){
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