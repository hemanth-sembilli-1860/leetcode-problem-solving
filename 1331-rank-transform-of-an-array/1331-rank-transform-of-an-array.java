class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int ans[] = Arrays.copyOf(arr,n);
        Arrays.sort(ans);
        HashMap<Integer,Integer> hs = new HashMap<>();
        int rank = 1;
        for (int i : ans){
            if (!hs.containsKey(i)){
                hs.put(i,rank);
                rank++;
            }
        }
        for (int i = 0;i<n;i++){
            ans[i] = hs.get(arr[i]);
        }
        return ans;
    }
}