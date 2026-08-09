class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        backtrack(candidates, 0, target, arr, res);
        return res;
    }
    private static void backtrack(int candidates[],int pos,int target,List<Integer> arr,List<List<Integer>> res){
        if (target == 0){
            res.add(new ArrayList<>(arr));
            return;
        }
        if (target<0){
            return;
        }
        for (int i = pos;i<candidates.length;i++){
            arr.add(candidates[i]);
            backtrack(candidates,i,target-candidates[i],arr,res);
            arr.remove(arr.size()-1);
        }
    }
}