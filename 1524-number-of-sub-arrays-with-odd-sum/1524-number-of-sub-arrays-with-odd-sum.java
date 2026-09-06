class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;
        int n = arr.length;
        int c = 0;
        int prefixSum[] = new int[n];
       prefixSum[0] = arr[0];
       int even = 1;
       int odd = 0;
        for (int i = 1;i<n;i++){
            prefixSum[i] = prefixSum[i-1]+arr[i];
        }
        for (int i = 0;i<n;i++){
            if ((prefixSum[i])%2 == 0){
                c = c+odd;
                even++;
            }
            else {
                c = c+even;
                odd++;
            }
            c = c%MOD;
        }
        return c;
    }
}

/*for (int i = 0;i<n;i++){
    int sum = 0;
    for (int j = i;j<n;j++){
        sum += arr[j];
        if (sum%2 != 0){
                    c++;
                }
            }
        }*/