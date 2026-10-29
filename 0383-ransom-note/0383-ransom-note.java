class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int a[] = new int[26];
        int n = ransomNote.length();
        int m = magazine.length();
        for (int i = 0;i<m;i++){
            char c = magazine.charAt(i);
            a[c-'a']++;
        }
        for (int i = 0;i<n;i++){
            char c = ransomNote.charAt(i);
            if (a[c-'a'] <=0){
                return false;
            }
            else {
                a[c-'a']--;
            }
        }
        return true;
    }
}