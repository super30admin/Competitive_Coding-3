// Time Complexity : O(n*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public List<List<Integer>> generate(int numRows) { 
        if(numRows==0)
            return new ArrayList<>();
        
        //initialisation of list
        List<List<Integer>> result = new ArrayList<>();
        
        //row traversing
        for(int i=0; i<numRows; i++) {
            //updating another list for each row
            List<Integer> row = new ArrayList<>();
            //column traversing
            for(int j=0; j<=i; j++) {
                if(j==0 || j==i)
                    row.add(1);
                else {
                    int a = result.get(i-1).get(j-1);
                    int b = result.get(i-1).get(j);
                    row.add(a+b);
                }
            }
            result.add(row);
        }
        return result;
    }
}
