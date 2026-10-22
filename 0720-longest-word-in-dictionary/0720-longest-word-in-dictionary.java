class Solution {
    public String longestWord(String[] words) {
        HashSet<String> set = new HashSet<>();
        Arrays.sort(words);
        String res = "";
        for (String g:words){
            if (g.length()==1 || set.contains(g.substring(0,g.length()-1))){
                set.add(g);
                if (g.length()>res.length()){
                    res = g;
                }
            }
        }
        return res;
    }
}