class Solution {
    public List<String> stringSequence(String target) {
        List<String> list = new ArrayList<>();
        int n = target.length();
        String s = "";
        while (!s.equals(target)) {
            for (int i = 0; i < n; i++) {
                if (i == s.length()) {
                    s = s + 'a';
                    list.add(s);
                    break; 
                }
                else if (target.charAt(i) != s.charAt(i)) {
                    char c = s.charAt(i);
                    if (c == 'z') {
                        s = s.substring(0, i) + 'a' + s.substring(i + 1);
                    }
                    else {
                        s = s.substring(0, i) + (char)(c + 1) + s.substring(i + 1);
                    }
                    list.add(s);
                    break;
                }
            }
        }
        return list;
    }
}