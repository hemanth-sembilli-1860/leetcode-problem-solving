class Solution {
    public int totalWaviness(int num1, int num2) {
        int total = 0;
        for (int i = num1;i<=num2;i++){
            total += peakValleys(i);
        }
        return total;
    }
    public static int peakValleys(int n){
        String k = String.valueOf(n);
        int c = 0;
        for (int i = 1;i<k.length()-1;i++){
            if ((k.charAt(i)>k.charAt(i-1)) && (k.charAt(i)>k.charAt(i+1)) ){
                c++;
            }
            else if ((k.charAt(i)<k.charAt(i-1)) && (k.charAt(i)<k.charAt(i+1)) ){
                c++;
            }
        }
        return c;
    }
}