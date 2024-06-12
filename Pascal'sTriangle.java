// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public List<List<Integer>> generate(int numRows) {
      
     List<List<Integer>> result = new ArrayList<>();
      
     // number of rows given
      for(int i = 0; i< numRows; i++) {
        List<Integer> row = new ArrayList<>();
        for(int j = 0; j <= i; j++) {
          //first and last column numbers are 1
          if(j == 0 || j == i) {
            row.add(1);
          } else {
             // sum of upperleft and right numbers
            int upperLeft = result.get(i-1).get(j-1);
            int upperRight = result.get(i-1).get(j);
            row.add(upperLeft+upperRight);
          }
        }
          //add newly formed row in to result
       result.add(row);
      }
       return result;
    }
}