class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        int nums[][] = new int[n][2];
        for (int i = 0;i<n;i++){
            for (int j = 0;j<2;j++){
                if (j%2 == 0){
                    nums[i][j] = Integer.bitCount(arr[i]);
                }
                else {
                    nums[i][j] = arr[i];
                }
            }
        }
        Arrays.sort(nums,(a,b)->{
            if (a[0] != b[0]){
                return Integer.compare(a[0],b[0]);
            }
            else {
                return Integer.compare(a[1],b[1]);
            }
        });
        for (int i = 0;i<n;i++){
            res[i] = nums[i][1];
        }
        return res;
    }
}