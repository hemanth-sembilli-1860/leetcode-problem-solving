class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {

    int m = operations.length;

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = m - 1; i >= 0; i--) {

        int old = operations[i][0];
        int newValue = operations[i][1];

        if (map.containsKey(newValue)) {
            map.put(old, map.get(newValue));
        } else {
            map.put(old, newValue);
        }
    }

    int n = nums.length;

    for (int i = 0; i < n; i++) {

        int k = nums[i];

        if (map.containsKey(k)) {
            nums[i] = map.get(k);
        }
    }

    return nums;
}
    /*public int[] arrayChange(int[] nums, int[][] operations) {
        int m = operations.length;
        int j = m;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i  = 0;i<m;i++){
            map.put(operations[i][0],operations[i][1]);
        }
        int n = nums.length;
        for (int i = 0;i<n;i++){
            int k = nums[i];
            if (map.containsKey(k)){
                nums[i] = map.get(k);
            }
        }
        return nums;
    }*/
}