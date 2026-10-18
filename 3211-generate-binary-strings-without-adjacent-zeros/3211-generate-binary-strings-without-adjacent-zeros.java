class Solution {
    public List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        solve(n,res,sb);
        return res;
    }
    public static void solve(int n,List<String> res,StringBuilder sb){
        if (sb.length() == n){
            res.add(sb.toString());
            return;
        }
        sb.append("1");
        solve(n,res,sb);
        sb.deleteCharAt(sb.length()-1);
        if (sb.length() == 0 || sb.charAt(sb.length()-1)!='0'){
            sb.append("0");
            solve(n,res,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}

//000 001 010 011 100 101 110 111