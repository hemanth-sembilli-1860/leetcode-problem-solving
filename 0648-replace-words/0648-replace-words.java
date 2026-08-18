class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> set = new HashSet<>(dictionary);
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (String k:set){
            if (words[i].startsWith(k)){
                if (k.length() < words[i].length()) {
                    words[i] = k;
                }
            }
            }
        }
        return String.join(" ",words);
    }
}