class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int copyArray[] = Arrays.copyOf(arr,n);
        Arrays.sort(copyArray);
        int res[] = new int[n];
        int j = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<n;i++){
            if (!map.containsKey(copyArray[i])){
                map.put(copyArray[i],j);
                j++;
            }
            else {
                continue;
            }
        }
        for (int i = 0;i<n;i++){
            res[i] = map.get(arr[i]);
        }
        return res;
    }
}