class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int c[] = new int[n];
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        for (int i = 0;i<n;i++){
            set1.add(A[i]);
            set2.add(B[i]);
            int cnt = 0;
            for (int j = 0;j<=i;j++){
                if (set1.contains(B[j]) && set2.contains(B[j])){
                    cnt++;
                }
            }
            c[i] = cnt;
        }
        return c;
    }
}