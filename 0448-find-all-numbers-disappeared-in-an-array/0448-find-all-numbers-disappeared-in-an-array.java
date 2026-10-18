class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        int freq[]=new int[n+1];
        for(int num:nums)
        {
            freq[num]++;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(freq[i]==0)
            {
                list.add(i);
            }
        }
        return list;
    }
}