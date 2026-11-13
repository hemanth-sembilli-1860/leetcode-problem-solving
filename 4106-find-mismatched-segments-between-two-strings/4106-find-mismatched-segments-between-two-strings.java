class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> res = new ArrayList<>();
        int m = s1.length();
        int n = s2.length();
        if (m!=n){
            return res;
        }
        for (int i = 0;i<n;i++){
            List<String> list = new ArrayList<>();
            StringBuilder sa = new StringBuilder();
            StringBuilder sb = new StringBuilder();
            if (s1.charAt(i)==s2.charAt(i)){
                continue;
            } 
            while (i<n && s1.charAt(i)!=s2.charAt(i)){
                sa.append(s1.charAt(i));
                sb.append(s2.charAt(i));
                i++;
            }
            list.add(sa.toString());
            list.add(sb.toString());
            res.add(new ArrayList<>(list));
        }
        return res;
    }
}