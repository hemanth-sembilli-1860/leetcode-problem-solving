class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n = arr1.length;
        int m = arr2.length;
        int c = 0;
        Arrays.sort(arr2);
        for (int i = 0;i<n;i++){
            int x = arr1[i];
            int idx = Arrays.binarySearch(arr2,x-d);
            boolean found = false;
            if (idx<0){
                idx = -idx-1;
            }
            if (idx<m && Math.abs(x-arr2[idx])<=d){
                found = true;
            }
            if (idx>0 && Math.abs(x-arr2[idx-1])<=d){
                found = true;
            }
            if (!found){
                c++;
            }
        }
        return c;
    }
}