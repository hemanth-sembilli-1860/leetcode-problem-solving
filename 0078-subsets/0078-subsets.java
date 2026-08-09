class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(nums,0,list,res);
        return res;
    }
    private void backtrack(int nums[],int pos,List<Integer> arr,List<List<Integer>> ans){
        int n = nums.length;
        ans.add(new ArrayList<>(arr));
        for (int i = pos;i<n;i++){
            arr.add(nums[i]);
            backtrack(nums,i+1,arr,ans);
            arr.remove(arr.size()-1);
        }
    }
}