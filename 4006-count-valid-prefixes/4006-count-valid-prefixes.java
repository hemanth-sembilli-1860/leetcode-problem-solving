class Solution {
    public static int count(String s){
        int n = s.length();
        int ones = 0;
        int zeros = 0;
        for (char c:s.toCharArray()){
            if (c == '1') ones++;
            if (c == '0') zeros++;
        }
        return Math.abs(ones-zeros);
    }
    public int countValidPrefixes(String s) {
        int c = 0;
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<n;i++){
            sb.append(s.charAt(i));
            if (count(sb.toString())<=1){
                 c++;
            }
        }
        return c;
    }
}
