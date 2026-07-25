class Solution {
    public static int len(int n){
        int c = 0;
        while (n!=0){
            c++;
            n = n/10;
        }
        return c;
    }
    public int maxProduct(int n) {
        if (len(n) == 0 || len(n) == 1){
            return n;
        }
        int a[] = new int[len(n)];
        int i = 0;
        while (n!=0){
            a[i] = n%10;
            n = n/10;
            i++;
        }
        Arrays.sort(a);
        int lena = a.length;
        return a[lena-1]*a[lena-2];
    }
}