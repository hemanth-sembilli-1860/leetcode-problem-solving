class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        int m = indices.length;
        HashMap<Integer,Character> map = new HashMap<>();
        for (int i = 0;i<n;i++){
            char ch = s.charAt(i);
            map.put(indices[i],ch);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<n;i++){
            sb.append(map.get(i));
        }
        return sb.toString();
    }
}