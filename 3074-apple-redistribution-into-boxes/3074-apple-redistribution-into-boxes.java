class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int n = apple.length;
        int m = capacity.length;
        int sum = 0;
        for (int i:apple){
            sum += i;
        }
        int c = 0;
        int i = m-1;
        while (sum>0){
                sum -= capacity[i];
                c++;
            i--;
        }
        return c;
    }
}

//1 3 2 = 6
// 1 2 3 4 5