class Solution {
    public String sortVowels(String s) {
        List<Character> list = new ArrayList<>();
        int n = s.length();
        for (int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if (isVowel(ch)){
                list.add(ch);
            }
            else {
                continue;
            }
        }
        Collections.sort(list);
        char g[] = s.toCharArray();
        int j = 0;
        for (int i = 0;i<n;i++){
            if (isVowel(g[i])){
                g[i] = list.get(j);
            }
            else {
                continue;
            }
            j++;
        }
        return new String(g);
    }
    public static boolean isVowel(char ch){
        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}