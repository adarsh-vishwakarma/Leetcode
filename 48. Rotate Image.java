class Solution {
    public void rotate(int[][] matrix) {
        int size = matrix.length;
        // swap col
        for(int col=0; col<size; col++) {
            int i = 0;
            int j = size - 1;
            while(i < j) {
                int temp = matrix[i][col];
                matrix[i][col] = matrix[j][col];
                matrix[j][col] = temp;
                i++;
                j--;
            }
        }

        //transpose of the matrix
        for(int i=0; i<size; i++) {
            for(int j=i+1; j<size; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
