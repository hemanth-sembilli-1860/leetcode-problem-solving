class Solution {
    public String digitSum(String s, int k) {
        while (s.length()>k){
            StringBuilder res = new StringBuilder();
            int n = s.length();
            for (int i = 0;i<n;i=i+k){
                int sum = 0;
                for (int j = i;j<Math.min(i+k,n);j++){
                    char c = s.charAt(j);
                     sum += (c-'0');
                }
                res.append(sum);
            }
            s = res.toString();
        }
        return s;
    }
}