class Solution {
    public static int reverse(int x) {
        int rev = 0;
        int dig;
        while (x != 0) {
            dig = x%10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && dig > 7)) {
            return 0;
        }
        if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && dig < -8)) {
            return 0;
        }
            rev = rev*10+dig;
            x = x/10;
        }
        return rev;
    }
}