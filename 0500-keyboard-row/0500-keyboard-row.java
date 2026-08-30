class Solution {
    public String[] findWords(String[] words) {
        String a = "qwertyuiop";
        String b = "asdfghjkl";
        String c = "zxcvbnm";
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        HashSet<Character> set3 = new HashSet<>();
        for (char d:a.toCharArray()){
            set1.add(d);
        }
        for (char d:b.toCharArray()){
            set2.add(d);
        }
        for (char d:c.toCharArray()){
            set3.add(d);
        }
        int n = words.length;
        List<String> ans = new ArrayList<>();
        for (int i = 0;i<n;i++){
            boolean check = true;
            for (int j = 0;j<words[i].length();j++){
                char ch = words[i].charAt(j);
                if (!set1.contains(ch) && (set2.contains(ch) || set3.contains(ch))) {
                    check = false;
                }
                else {
                    continue;
                }
            }
            if (check){
                ans.add(words[i]);
            }
        }
        for (int i = 0;i<n;i++){
            boolean check = true;
            for (int j = 0;j<words[i].length();j++){
                char ch = words[i].charAt(j);
                if (!set2.contains(ch) && (set1.contains(ch) || set3.contains(ch))) {
                    check = false;
                }
                else {
                    continue;
                }
            }
            if (check){
                ans.add(words[i]);
            }
        }
        for (int i = 0;i<n;i++){
            boolean check = true;
            for (int j = 0;j<words[i].length();j++){
                char ch = Character.toLowerCase(words[i].charAt(j));
                if (!set3.contains(ch) && (set1.contains(ch) || set2.contains(ch))) {
                    check = false;
                }
                else {
                    continue;
                }
            }
            if (check){
                ans.add(words[i]);
            }
        }
        return ans.toArray(new String[0]);
    }
}