class Solution {
    public String sortSentence(String s) {
        String st[] = s.split(" ");
        int n = st.length;
        String sp[] = new String[n];
        String k = "";
        for (int i = 0;i<n;i++){
            int x = st[i].length();
            int j = st[i].charAt(x-1)-'0';
            sp[j-1] = st[i].substring(0,x-1);
        }
        k = String.join(" ",sp);
        return k;
    }
}