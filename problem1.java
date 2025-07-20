// Time Complexity: O(n^2)
// Space Complexity: O(n)

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        result.add(List.of(1));
        if (numRows == 1) {
            return result;
        }
        
        result.add(List.of(1,1));
        if (numRows == 2) {
            return result;
        }

        for (int i=2; i<numRows; i++) {
            List<Integer> prevList = result.get(i-1);
            List<Integer> currList = new ArrayList<>();
            currList.add(prevList.get(0));
            for (int j=1; j<=i-1; j++) {
                currList.add(prevList.get(j-1) + prevList.get(j));
            }
            currList.add(prevList.get(i-1));
            result.add(currList);
        }

        return result;
    }
}
