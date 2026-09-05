class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int c[] = new int[n];
        int a = 0;
        int b = n-1;
        int i = 0;
        int j = n-1;
        while (i<n && j>=0){
            if (nums[i]<pivot){
                c[a] = nums[i];
                a++;
            }
            if (nums[j]>pivot){
                c[b] = nums[j];
                b--;
            }
            i++;
            j--;
        }
        while (a<=b){
            c[a] = pivot;
            a++;
        }
        return c;
    }
}