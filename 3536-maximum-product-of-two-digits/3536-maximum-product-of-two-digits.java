class Solution {
    
    public int maxProduct(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        while (n!=0){
            res.add(n%10);
            n = n/10;
        }
        if (res.size() == 0 || res.size() == 1){
            return n;
        }
        Collections.sort(res);
        int s = res.size();
        return res.get(s-1)*res.get(s-2);
    }
}