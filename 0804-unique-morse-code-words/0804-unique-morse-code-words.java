class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String arr[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int n = words.length;
        int m = arr.length;
        HashSet<String> set = new HashSet<>();
        for (int i = 0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            for (int j = 0;j<words[i].length();j++){
                int k = words[i].charAt(j)-'a';
                sb.append(arr[k]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}