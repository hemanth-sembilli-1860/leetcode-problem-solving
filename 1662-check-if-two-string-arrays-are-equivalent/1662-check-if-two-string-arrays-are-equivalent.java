class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (String k:word1){
            s1.append(k);
        }
        for (String k:word2){
            s2.append(k);
        }
        return s1.toString().equals(s2.toString());
    }
}