class Solution {
    public String longestWord(String[] words) {
        int n = words.length;
        HashSet<String> set = new HashSet<>();
        for (int i = 0;i<n;i++){
            set.add(words[i]);
        }
        Arrays.sort(words);
           String ans = "";
        for (int i = n-1;i>=0;i--){
            String k = words[i];
            StringBuilder sb = new StringBuilder();
            boolean valid = true;
            for (int j = 0;j<k.length();j++){
                sb.append(k.charAt(j));
                if (!set.contains(sb.toString())){
                    valid = false;
                    break;
                }
            }
            if (valid) {
                if (k.length() > ans.length() ||(k.length() == ans.length() && k.compareTo(ans) < 0)) {
                    ans = k;
                }
            }
        }
        return ans;
    }
}