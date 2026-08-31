class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String arr[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int n = words.length;
        int m = arr.length;
        HashSet<String> set = new HashSet<>();
        for (String s:words){
            StringBuilder sb = new StringBuilder();
            for (char c:s.toCharArray()){
                int k = c-'a';
                sb.append(arr[k]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}