class Solution {
    public boolean checkIfPangram(String sentence) {
        for (char p = 'a';p<='z';p++){
            if (!sentence.contains(String.valueOf(p))){
                return false;
            }
        }
        return true;
    }
}