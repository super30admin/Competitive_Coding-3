// Time Complexity :O(n^2)
// Space Complexity :0(n^2)
// Did this code successfully run on Leetcode :Yess
// Any problem you faced while coding this :Just about creating a logic


// Your code here along with comments explaining your approach: i create a row and then add into the arraylist using tow for loops.
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result= new ArrayList<>();
        if(numRows==0) return result;
        List<Integer> firstRow= new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        if(numRows==1) return result;
        for(int i=1; i<numRows; i++){
            List<Integer> prevRow= result.get(i-1);
            ArrayList<Integer> row= new ArrayList<>();
            row.add(1);
            for(int j=0;j<i-1; j++ ){
                row.add(prevRow.get(j)+prevRow.get(j+1));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}