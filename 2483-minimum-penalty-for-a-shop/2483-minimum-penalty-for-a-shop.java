class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int arr[] = new int[n];
        for (int i =0;i<n;i++){
            char ch = customers.charAt(i);
            if (ch == 'Y'){
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }
        }
        int sum = 0;
        for (int i = 0;i<n;i++){
            sum += arr[i];
        }
        int min = sum;
        int innerSum = sum;
        int bestIteration = 0;
        for (int i = 1;i<=n;i++){
            if (arr[i-1] == 0){
                innerSum++;
            }
            else {
                innerSum--;
            }
            if (innerSum<min){
                min = innerSum;
                bestIteration = i;
            }
        }
        return bestIteration;
    }
}