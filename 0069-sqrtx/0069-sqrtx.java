class Solution {
    public int mySqrt(int x) {
        int i = 0;
        int j = x;
        int res = 0;
        while (i<=j){
            int mid = i+(j-i)/2;
            if ((long)mid*mid == x){
                return mid;
            }
            else if ((long)mid*mid<x){
                res = mid;
                i = mid+1;
            }
            else {
                j = mid-1;
            }
        }
        return res;
    }
}