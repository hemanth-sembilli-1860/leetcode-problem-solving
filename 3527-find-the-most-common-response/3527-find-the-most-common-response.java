class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        int n = responses.size();
        HashMap<String,Integer> map = new HashMap<>();
        //List<Set<String>> list = new ArrayList<>();
        for (int i = 0;i<responses.size();i++){
            Set<String> set = new HashSet<>();
            for (int j = 0;j<responses.get(i).size();j++){
                set.add(responses.get(i).get(j));
            }
            for (String k:set){
                map.put(k,map.getOrDefault(k,0)+1);
            }
        }
        int val = Integer.MIN_VALUE;
        String key = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > val || (entry.getValue() == val && entry.getKey().compareTo(key) < 0)) {
                val = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }
}