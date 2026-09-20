class Solution {
    public int reverseDegree(String s) {
        int count = 0;
        int n = s.length();
        for (int i = 0;i<n;i++){
            char ch = s.charAt(i);
            count += ((i+1)*(26-(ch-'a')));
        }
        return count;
    }
}