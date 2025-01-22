class PascalTriangleSolution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int n = 0; n < numRows; n++) {
            List<Integer> inner = new ArrayList<>();
            inner.add(1);// first element in the row
            for (int i = 1; i < n; i++) {
                int leftTop = result.get(n - 1).get(i - 1);
                int rightTop = result.get(n - 1).get(i);
                inner.add(leftTop + rightTop);
            }
            if (n > 0) {
                inner.add(1);// last element in the row
            }
            result.add(inner);
        }
        return result;
    }
}