//Time complexity: O(numRows ^ 2)
//Space complexity: O(numRows ^ 2)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for(int i = 1; i < numRows; i++) {
            List<Integer> current_row = new ArrayList<>();
            List<Integer> previous_row = result.get(i-1);
            current_row.add(1);
            for(int j = 1; j < i; j++) {
                current_row.add(previous_row.get(j-1) + previous_row.get(j));
            }
            current_row.add(1);
            result.add(current_row);
        }
        return result;
    }
}