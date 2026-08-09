class Solution {
    public int subsetXORSum(int[] nums) {
        int sum[] = new int[1];
        List<Integer> list = new ArrayList<>();
        backtrack(nums,0,list,sum);
        return sum[0];
    }
    private void backtrack(int nums[],int pos,List<Integer> arr,int sum[]){
        int xor = 0;
        int n = nums.length;
        for (int num:arr){
           xor ^= num;
        }
        sum[0] += xor;
        for (int i = pos;i<n;i++){
            arr.add(nums[i]);
            backtrack(nums,i+1,arr,sum);
            arr.remove(arr.size()-1);
        }
    }
}