class Solution {
    public static int product(int n){
        int prod = 1;
        while (n>0){
            int dig = n%10;
            prod *= dig;
            n = n/10;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        int k = 1;
        for (int i = n;i<=100;i++){
            if (product(i)%t == 0){
                k  = i;
                break;
            }
        }
        return k;
    }
}