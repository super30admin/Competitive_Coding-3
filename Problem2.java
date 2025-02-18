// Time Complexity : O(n2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
Create new row from previos row
 */

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        answer.add(firstRow);

        if (numRows == 1) {
            return answer;
        }

        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(1);
        secondRow.add(1);
        answer.add(secondRow);
        if (numRows == 2) {
            return answer;
        }

        for(int i=2;i<numRows;i++){
            List<Integer> rows=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    rows.add(1);
                }
                else {
                    List<Integer> prev=answer.get(i-1);
                    rows.add(prev.get(j-1)+prev.get(j));
                }
            }
            answer.add(rows);
        }

        return answer;
    }
}