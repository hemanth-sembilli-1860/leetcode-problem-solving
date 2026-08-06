class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> list = new ArrayList<>();
        HashMap<String,Integer> hm = new HashMap<>();
        for (String k:s1.split(" ")){
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        for (String k:s2.split(" ")){
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        for (Map.Entry<String,Integer> entry:hm.entrySet()){
            if (entry.getValue() == 1){
                list.add(entry.getKey());
            }
        }
        return list.toArray(new String[0]);
    }
}