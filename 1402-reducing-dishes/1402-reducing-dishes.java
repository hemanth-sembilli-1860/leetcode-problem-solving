class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        int n = satisfaction.length;
        Arrays.sort(satisfaction);
        int suffixSum = 0;
        int answer = 0;
        for (int i = n-1;i>=0;i--){
            suffixSum += satisfaction[i];
            if (suffixSum<0){
                break;
            }
            answer += suffixSum;
        }        
        return answer;
    }
}