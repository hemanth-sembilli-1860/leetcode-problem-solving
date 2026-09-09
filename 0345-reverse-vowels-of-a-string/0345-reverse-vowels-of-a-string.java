class Solution {
    public String reverseVowels(String s) {
        char c[] = s.toCharArray();
        int n = s.length();
        int i = 0;
        int j = n-1;
        while (i<j){
            while (i<j && !isVowel(c[i])){
                i++;
            }
            while (i<j && !isVowel(c[j])){
                j--;
            }
            char t = c[i];
            c[i] = c[j];
            c[j] = t;

            i++;
            j--;
        }
        return new String(c);
    }
    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' 
        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}