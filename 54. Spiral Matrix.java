class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int startRow = 0;
        int startCol = 0;
        int endRow = m-1;
        int endCol = n-1;
        int count = m*n;
        List<Integer> result = new ArrayList<>();
        while(count > 0) {
            for(int i=startCol; i<=endCol; i++) {
                result.add(matrix[startRow][i]);
                count--;
            }
            startRow++;
            if(count == 0) break;

            for(int i=startRow; i<=endRow; i++) {
                result.add(matrix[i][endCol]);
                count--;
            }
            endCol--;
            if(count == 0) break;

            for(int i=endCol; i>=startCol; i--) {
                result.add(matrix[endRow][i]);
                count--;
            }
            endRow--;
            if(count == 0) break;

            for(int i=endRow; i>=startRow; i--) {
                result.add(matrix[i][startCol]);
                count--;
            }
            startCol++;
            if(count == 0) break;
        }

        return result;
    }
}
