class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr){
            set.add(i);
        }
        int j = 0;
        for (int i = 1;;i++){
            if(!set.contains(i)) j++;
            if(j==k) return i;
        }
    }
}