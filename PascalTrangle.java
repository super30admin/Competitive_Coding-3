class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);

        result.add(firstList);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> nextRow = new ArrayList<>();
            nextRow.add(1);

            for (int j = 1; j < i; j++) {
                nextRow.add(prevRow.get(j) + prevRow.get(j - 1));
            }

            nextRow.add(1);
            result.add(nextRow);
        }
        return result;
    }
}
