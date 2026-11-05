class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = s.length();
        int j = 0; 
        int m = spaces.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<n;i++){
            if (j<m && i == spaces[j]){
                sb.append(" ");
                j++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}