// tc: O(n)
// sc : O(n)
class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> intermediate;

        for (int i = 1; i <= numRows; i++) {
            long num = 1;
            for (int k = 1; k < i; k++) {
                num *= 11;
            }
            String s = Long.toString(num);
            char[] ch = s.toCharArray();
            intermediate = new ArrayList<>();
            for (char j : ch) {
                intermediate.add(j - 48);
            }
            result.add(intermediate);
        }
        return result;

    }
}