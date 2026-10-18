class Solution {
    public int getLeastFrequentDigit(int n) {
        String v = String.valueOf(n);
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c:v.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int min = ' ';
        int min_count = Integer.MAX_VALUE;
        for (char c:map.keySet()){
            if (map.get(c)<min_count){
                min_count = map.get(c);
                min = c-'0';
            }
        }
        return min;
    }
}