class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        boolean used[] = new boolean[n];
        permut(nums,used,arr,res);
        return res;
    }
    public void permut(int nums[],boolean used[],List<Integer> arr,List<List<Integer>> res){
        int n = nums.length;
        if (n == arr.size()){
            res.add(new ArrayList<>(arr));
            return;
        }
        for (int i = 0;i<n;i++){
            if (used[i]) continue;
            arr.add(nums[i]);
            used[i] = true;
            permut(nums,used,arr,res);
            used[i] = false;
            arr.remove(arr.size()-1);
        }
    }
}