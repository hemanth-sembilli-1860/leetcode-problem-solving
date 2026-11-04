class Solution {
    public String restoreString(String s, int[] indices) {
        char c[] = s.toCharArray();
        int n = s.length();
        for (int i = 0;i<n;i++){
            c[indices[i]] = s.charAt(i);
        }
        return new String(c);
    }
}