class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];
        int i = 0;
        int j = 0;
        while(i < matrix.length){
            j = 0;
            while(j < matrix[0].length){
                
                transposeMatrix[j][i] = matrix[i][j];
                j++;
            }
            i++;
        }

        return transposeMatrix;
    }
}
