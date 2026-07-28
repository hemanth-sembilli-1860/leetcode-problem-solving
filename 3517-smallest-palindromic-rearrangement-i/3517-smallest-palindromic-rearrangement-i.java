class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int freq[] = new int[26];
        for (char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        String middle = "";
        StringBuilder first = new StringBuilder();
        for (int i = 0;i<26;i++){
            if (freq[i]%2==1){
                middle = String.valueOf((char)('a'+i));
            }
            for (int j = 0;j<freq[i]/2;j++){
                first.append((char)('a'+i));
            }
        }
        String left = first.toString();
        String right = new StringBuilder(left).reverse().toString();
        return left + middle + right;
    }
}