// Time Complexity :O(n^2)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * We keep two arrayLists. One to maintain the row and update it and one to store previous rows elements so we can calculate the next row. 
 * 
 If j ==0 or j == i, the starting and ending element of each row, we store 1. 
 For other values, we calculate the previous rows top elements, j and j+1 and store it in the row. 
 Once a row is computed, we add it into our li ArrayList. 
 */

public class Problem2 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li = new ArrayList<>();
        for(int i =0; i < numRows; i++){
            List<Integer> row = new ArrayList();
            for(int j =0; j <= i; j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    List<Integer> prevRow = li.get(i-1);
                    int sum = prevRow.get(j-1)+prevRow.get(j);
                    row.add(sum);
                }
            }
            li.add(row);
        }
        return li;
    }
}
