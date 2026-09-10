class Solution {
    public int minSteps(String s, String t) {
        int n = s.length();
        int m = t.length();
        int cnt = 0;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for (char c:s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for (char c:t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        for (char c:map1.keySet()){
            int f1 = map1.get(c);
            int f2 = map2.getOrDefault(c,0);
            if (f1>f2){
                cnt += f1-f2;
            }
        }
        return cnt;
    }
}


//p -- 1,r --  1,a --  1,c -- 0,