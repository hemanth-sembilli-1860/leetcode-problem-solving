class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> arr = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        backtrack(1,n,k,arr,list);
        return list;
    }
    private static void backtrack(int pos,int n,int k,List<Integer> arr ,List<List<Integer>> list){
        if (k == arr.size()){
            list.add(new ArrayList<>(arr));
            return;
        }
        for (int i = pos;i<=n;i++){
            arr.add(i);
            backtrack(i+1,n,k,arr,list);
            arr.remove(arr.size()-1);
        }
    }
}