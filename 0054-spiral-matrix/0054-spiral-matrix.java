class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top = 0,bottom = matrix.length-1;
        int left = 0,right = matrix[0].length-1;
        while (left<=right && top<=bottom){
            for (int i = left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if (top<=bottom){
                for (int k = right;k>=left;k--){
                    list.add(matrix[bottom][k]);
                }
                bottom--;
            }
            if (left<=right){
                for (int k = bottom;k>=top;k--){
                    list.add(matrix[k][left]);
                }
                left++;
            }
        }
        return list;
    }
}