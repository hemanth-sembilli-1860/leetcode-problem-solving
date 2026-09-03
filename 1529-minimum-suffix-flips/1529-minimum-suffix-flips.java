class Solution {
    public int minFlips(String target) {
        int flips = 0;
        int flipped = 0;
        int n = target.length();
        for (int i = 0;i<n;i++){
            int current = flipped;
            if (current != target.charAt(i)-'0'){
                flips++;
                flipped = 1-flipped;
            }
        }
        return flips;
    }
}