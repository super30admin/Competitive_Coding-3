// Time Complexity :o(n^2)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :initially some compilation errors


// Your code here along with comments explaining your approach:- initially first row is added,taking two loops
// in which first variable is i which starts from 1 and j from 0 for getting sum using pointer that points current and previous
// take the sum in such a way that it covers last place 1 also and finally returning list.

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> List0 = new ArrayList<>();
        List<Integer> List1 = new ArrayList<>();
        List1.add(1);
        List0.add(List1);
        for(int i=1;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                int temp=((j-1>=0)?List0.get(i-1).get(j-1):0)
                            + ((j!=i)?List0.get(i-1).get(j):0);
                row.add(temp);
            }
            List0.add(row);
        }
        return List0;
    }
}
