class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0;i<numRows;i++){
            List<Integer> row = new ArrayList<>(Collections.nCopies(i+1,1));
            for (int j = 1;j<i;j++){
                row.set(j,list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            list.add(row);
        }
        return list;
    }
}