class Solution {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        int arr[] = Arrays.copyOf(nums,nums.length);
        return arr;
    }
}