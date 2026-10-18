class Solution {
    public int getLeastFrequentDigit(int n) {
        int freq[] = new int[10];
        while (n>0){
            int dig = n%10;
            freq[dig]++;
            n = n/10;
        }
        int min = 100;
        int res = 0;
        for (int i = 0;i<10;i++){
            if (freq[i]>0 && freq[i]<min){
                min = freq[i];
                res = i;
            }
        }
        return res;
    }
}