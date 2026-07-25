class Solution {
    public static int[]  merge(int[] nums1,int[] nums2){
        int n = nums1.length;
        int m = nums2.length;
        int c[] = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<n && j<m){
            if (nums1[i]<nums2[j]){
                c[k] = nums1[i];
                i++;
            }
            else {
                c[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i<n){
            c[k] = nums1[i];
            i++;
            k++;
        }
        while (j<m){
            c[k] = nums2[j];
            j++;
            k++;
        }
        return c;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = merge(nums1,nums2);
        double median = 0;
        if (arr.length%2 == 0){
            median = (double)(arr[(arr.length/2)] + arr[(arr.length/2-1)])/2;
        }
        else {
            median = arr[(arr.length)/2];
        }
        return median;
    }
}