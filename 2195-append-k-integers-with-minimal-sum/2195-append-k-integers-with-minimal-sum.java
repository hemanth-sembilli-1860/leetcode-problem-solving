class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        long sum = 0;
        for (int num: nums) {
            if (!set.contains(num) && num <= k) {
                k++;
                sum += num;        
            }            
            set.add(num);
        }
        long res = (long)(1 + k) * k / 2 - sum;
        return res;
    }
}




//0 2 5 14 0




















/*Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for (int i:nums){
            set.add(i);
        }
        long sum = 0;
        int i = 1;
        while (k!=0){
            if (!set.contains(i)){
                sum += i;
                k--;
            }
            i++;
        }
        return sum;*/