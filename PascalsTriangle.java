class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        int[][] matrix = new int[numRows][numRows];

        for (int i=1; i<matrix.length; i++) {
            for (int j=1; j<matrix[0].length; j++) {
                matrix[i][j] = 0;
            }
        }

        for (int i=0; i<matrix.length; i++) {
            matrix[0][i] = 1;
        }

        for (int i=1; i<matrix.length; i++) {
            for (int j=1; j<matrix[0].length; j++) {
                matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
            }
        }

        for (int i=1; i<matrix.length; i++) {
            for (int j=1; j<matrix[0].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }

        return result;

    }
}