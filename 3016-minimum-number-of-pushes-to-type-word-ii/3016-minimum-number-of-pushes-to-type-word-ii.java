class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int freq[] = new int[26];
        for (char c :word.toCharArray()){
            freq[c-'a']++;
        }
        int ans = 0;
        int cost = 1;
        int used = 0;
        Arrays.sort(freq);
        for (int i = 25;i>=0;i--){
            if (freq[i] == 0){
                break;
            }
            ans += freq[i]*cost;
            used++;
            if (used == 8){
                used = 0;
                cost++;
            }
        }
        return ans;
    }
}