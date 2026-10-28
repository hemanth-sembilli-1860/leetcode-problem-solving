class Solution {
    public int countVowelSubstrings(String word) {
        HashSet<Character> set = new HashSet<>();
        int c = 0;
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int n = word.length();
        for (int i = 0;i<n;i++){
            HashSet<Character> seen = new HashSet<>();
            for (int j = i;j<n;j++){
                char ch = word.charAt(j);
                if (!set.contains(ch)){
                    break;
                }
                seen.add(ch);
                if (seen.size() == 5){
                    c++;
                }
            }
        }
        return c;
    }
}