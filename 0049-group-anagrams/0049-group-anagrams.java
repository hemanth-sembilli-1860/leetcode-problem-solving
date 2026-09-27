class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        int n = strs.length;
        for (String s:strs){
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String snew = new String(arr);
            if (!map.containsKey(snew)){
                map.put(snew,new ArrayList<>());
            }
            map.get(snew).add(s);
        }
        return new ArrayList<>(map.values());
    }
}