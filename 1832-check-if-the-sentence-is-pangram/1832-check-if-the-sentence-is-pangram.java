class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length()<26) return false;
        for (char p = 'a';p<='z';p++){
            if (sentence.indexOf(p) == -1){
                return false;
            }
        }
        return true;
    }
}