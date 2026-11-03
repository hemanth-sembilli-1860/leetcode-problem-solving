class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        HashSet<String> set = new HashSet<>();
        for (String s:nums){
            set.add(s);
        }
        for (int i = 0;i<(int)Math.pow(2,n);i++){
            String s = String.format("%"+n+"s",Integer.toBinaryString(i)).replace(' ','0');
            if (!set.contains(s)){
                return s;
            }
        }
        return "";
    }
}