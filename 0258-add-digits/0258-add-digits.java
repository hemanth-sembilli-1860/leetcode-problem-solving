class Solution {
    public static int addIt(int num){
        int sum = 0;
        while (num!=0){
            sum += num%10;
            num = num/10;
        }
        if (sum>=10){
            return addIt(sum);
        }
        return sum;
    }
    public int addDigits(int num) {
        return addIt(num);
    }
}