class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        int d = word.indexOf(ch);
        String s = word.substring(0,d+1);
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString()+word.substring(d+1,n);
    }
}