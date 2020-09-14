// Time: O(N^2)
// Space: O(1)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i)
                    row.add(1);
                else {
                    row.add(allrows.get(i - 1).get(j - 1) + allrows.get(i - 1).get(j));

                }
            }
            allrows.add(row);
        }

        return allrows;
    }
}