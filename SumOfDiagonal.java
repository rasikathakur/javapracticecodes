class Solution {
    public int diagonalSum(int[][] mat) {
        int i = 0;
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int diagonalSum = 0;

        if(mat.length != mat[0].length)
            return 0;

        while(i < mat.length){
            primaryDiagonalSum += mat[i][i];
            secondaryDiagonalSum += mat[i][mat.length - i - 1];
            i++;
        }
        if(mat.length % 2 == 0){
            diagonalSum = primaryDiagonalSum + secondaryDiagonalSum;
        }else{
            diagonalSum = primaryDiagonalSum + secondaryDiagonalSum - mat[mat.length/2][mat.length/2];
        }

        return diagonalSum;
    }
}

// i = 0
// n = 3 
// j = n - i - 1
// j = 3 - 0 - 1 = 2

// i = 1
// n = 3
// j = n - i - 1
// j = 3 - 1 - 1 = 1

// i = 2
// n = 3
// j = n - i - 1
// j = 3 - 2 - 1 = 0
