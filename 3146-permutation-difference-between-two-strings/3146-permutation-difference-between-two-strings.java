class Solution {
    public int findPermutationDifference(String s, String t) {
        int n = s.length();
        int m = t.length();
        int sum = 0;
        for (int i = 0;i<n;i++){
            char ch = s.charAt(i);
            for (int j = 0;j<m;j++){
                if (ch == t.charAt(j)){
                    sum += Math.abs(i-j);
                }
            }
        }
        return sum;
    }
}