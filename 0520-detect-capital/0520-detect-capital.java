class Solution {
    public static boolean allSmaller(String word){
        int n = word.length();
        boolean allSmall = true;
        for (char ch:word.toCharArray()){
            if (!Character.isLowerCase(ch)){
                allSmall = false;
                break;
            }
        }
        return allSmall;
    }
    public static boolean allCapitals(String word){
        int n = word.length();
        boolean allCapital = true;
        for (char ch:word.toCharArray()){
            if (!Character.isUpperCase(ch)){
                allCapital = false;
                break;
            }
        }
        return allCapital;
    }
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        if (allCapitals(word) || allSmaller(word) || (Character.isUpperCase(word.charAt(0)) && allSmaller(word.substring(1)))){
            return true;
        }
        else {
            return false;
        }
    }
}