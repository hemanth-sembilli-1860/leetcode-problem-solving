class Solution {
    public int maxFreqSum(String s) {
        int n = s.length();
        int arr[] = new int[26];
        for (int i = 0;i<n;i++){
            char ch = s.charAt(i);
            arr[ch-'a']++;
        }
        int vmax = 0;
        int cmax = 0;
        for (int i = 0;i<26;i++){
            if (i == 0 || i == 4 || i == 8 || i == 14 || i == 20){
                vmax = Math.max(vmax,arr[i]);
            }
            else {
                cmax = Math.max(cmax,arr[i]);
            }
        }
        return vmax+cmax;
    }
}