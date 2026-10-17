class Solution {
    public static int digitSum(int n){
        int sum = 0;
        while (n>0){
            int dig = n%10;
            sum += dig;
            n = n/10;
        }
        return sum;
    }
    public int minSwaps(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:nums){
            map.put(i,digitSum(i));
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->{
            int cmp = Integer.compare(a.getValue(),b.getValue());
            if (cmp == 0){
                return Integer.compare(a.getKey(),b.getKey());
            }
            return cmp;
        });
        pq.addAll(map.entrySet());
        int pos = 0;
        while (!pq.isEmpty()){
            Map.Entry<Integer,Integer> entry = pq.poll();
            entry.setValue(pos++);
        }
        int swaps = 0;
        boolean visited[] = new boolean[n];
        for (int i = 0;i<n;i++){
            if (visited[i]){
                continue;
            }
            int j = i;
            int cycleSize = 0;
            while (!visited[j]){
                visited[j] = true;
                j = map.get(nums[j]);
                cycleSize++;
            }
            if (cycleSize>1){
                swaps += cycleSize-1;
            }
        }
        return swaps;
    }
}