class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int n = s.length();
        int m = p.length();
        if (m>n){
            return new ArrayList<>();
        }
        char y[] = p.toCharArray();
        Arrays.sort(y);
        String u = new String(y);
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (int i = 0;i<n;i++){
            char ch = s.charAt(i);
            sb.append(ch);
            while (sb.length()>m){
                sb.deleteCharAt(0);
                j++;
            }
            if (sb.length() == m){
                char a[] = sb.toString().toCharArray();
                Arrays.sort(a);
                String sp = new String(a);
                if (u.equals(sp)){
                   list.add(j);
                }
            }
        }
        return list; 
    }
}