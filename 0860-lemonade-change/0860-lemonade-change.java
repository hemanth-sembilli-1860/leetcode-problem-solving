class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;
        int n = bills.length;
        int c = 0;
        for (int i = 0;i<n;i++){
            if (bills[i] == 5){
                fiveCount++;
            }
            else if (bills[i] == 10){
                tenCount++;
                if (fiveCount>0) fiveCount--;
                else return false;
            }
            else if (bills[i] == 20){
                if (tenCount>0 && fiveCount>0){
                    tenCount--;
                    fiveCount--;
                } 
                else if (fiveCount >= 3){
                    fiveCount -= 3;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}


//25
//10+30