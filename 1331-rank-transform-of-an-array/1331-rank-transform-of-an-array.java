class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int a[] = Arrays.copyOf(arr,n);
        Arrays.sort(a);
        HashMap<Integer,Integer> map = new HashMap<>();
        int j = 1;
        for (int i = 0;i<n;i++){
            if (map.containsKey(a[i])){
                continue;
            }
            map.put(a[i],j);
            j++;
        }
        for (int i = 0;i<n;i++){
            if (map.containsKey(arr[i])){
                arr[i] = map.get(arr[i]);
            }
        }
        return arr;
    }
}