/** Pascal's Triangle
* TC O(N) SC O(1)
* Code was submitted on leetcode
*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        if (numRows == 0)
            return pascal;
        for (int i = 0 ; i < numRows; i++) {
            List<Integer> rowList = new ArrayList<>();
            if (pascal.isEmpty()) {
                rowList.add(1);
                pascal.add(rowList);
              
            } else if (i == 1) {
                rowList.add(1);
                rowList.add(1);
                pascal.add(rowList);
            }
            else
            {
               List<Integer> existing = pascal.get(i-1);
               rowList.add(1);
               int current = 0, prev = 0;
               for (int j = 0; j<existing.size()-1; j++) {
                   rowList.add(existing.get(j) + existing.get(j+1));
               }
               rowList.add(1);
               pascal.add(rowList);
            }
            
        }
        return pascal;
    }
}
