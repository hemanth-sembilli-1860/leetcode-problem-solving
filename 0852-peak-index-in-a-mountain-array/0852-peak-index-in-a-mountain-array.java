class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int target = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > target) {
                target = arr[i];
                index = i;
            }
        }

        return index;
    }
}