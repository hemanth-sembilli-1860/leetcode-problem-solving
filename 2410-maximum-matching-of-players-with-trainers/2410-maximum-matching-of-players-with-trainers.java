class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int n = players.length;
        int i = 0;
        int m = trainers.length;
        int j = 0;
        int c = 0;
        while (i<n && j<m){
            if (players[i]<=trainers[j]){
                i++;
                j++;
                c++;
            }
            else {
                j++;
            }
        }
        return c;
    }
}