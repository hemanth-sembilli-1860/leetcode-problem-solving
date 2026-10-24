class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String a[] = arriveAlice.split("-");
        String b[] = leaveAlice.split("-");
        String c[] = arriveBob.split("-");
        String d[] = leaveBob.split("-");
        int res1 = 0;
        int res2 = Integer.MAX_VALUE;
        int start1 = Integer.parseInt(a[0])*100+Integer.parseInt(a[1]);
        int start2 = Integer.parseInt(c[0])*100+Integer.parseInt(c[1]);
        int end1 = Integer.parseInt(b[0])*100+Integer.parseInt(b[1]);
        int end2 = Integer.parseInt(d[0])*100+Integer.parseInt(d[1]);
        res1 = Math.max(start1,start2);
        res2 = Math.min(end1,end2);
        if (res1>res2){
            return 0;
        }
        int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int startMonth = res1/100;
        int startDay = res1%100;
        int endMonth = res2/100;
        int endDay = res2%100;
        int startDate = startDay;
        for (int i = 0;i<startMonth-1;i++){
            startDate += days[i];
        }
        int endDate = endDay;
        for (int i = 0;i<endMonth-1;i++){
            endDate += days[i];
        }
        return endDate-startDate+1;
    }
}