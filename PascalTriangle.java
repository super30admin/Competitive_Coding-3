// Time Complexity : O(n^2), since we are generating row by row and the last row would have #elements=n, (numRows)
// Space Complexity : O(n), for creating the new row, if output is also taken into account then O(n^2)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : indexing the arraylist as I was generating rows from 1->numRows
//Initializing the arraylist of arraylist, I wrote ArrayList<ArrayList<Integer>> but then there was a type mismatch
//ArrayList to List is a bit unclear

// Your code here along with comments explaining your approach
// generate row by row, each row contains #elements = row#
// when ever its the first/last element, just add 1
// main generation logic is pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j]

class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> pascal = new ArrayList<List<Integer>>();
        if(numRows==0){
            return pascal;
        }
        
        pascal.add(Arrays.asList(1));
        
        for(int i=2; i<=numRows; i++){
            ArrayList<Integer> row = new ArrayList<Integer>();
            for(int j=0; j<i; j++){
                if(j==0 || j==i-1){
                    row.add(1);
                }
                else{
                    //previous row is i-2 here since I started referencing rows,(i) from 1, but in arraylist starts from 0
                    row.add(pascal.get(i-2).get(j-1) + pascal.get(i-2).get(j));
                }
            }
            pascal.add(row);
        }
        
        return pascal;
    }
}
