// Time Complexity : O(n) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        //null check
        if(numRows == 0) return null;
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        List<Integer> first = new ArrayList<Integer>();
        first.add(1);
        
        result.add(first);
        
        for( int i = 1; i < numRows; i++ ) {
            List<Integer> row = new ArrayList<Integer>(); //for creating current row
            List<Integer> prevRow = result.get(i-1); //fetching prev row
            row.add(1); //first element is always going to be 1
                
            for(int j = 1; j < i; j++) {
                int sum = prevRow.get(j) + prevRow.get(j-1); 
                //summation of consecutive elements from previous row
                row.add(sum); //adding sum to row
            }
            row.add(1); //last element is always 1 too
            
            result.add(row); //adding the current row to resulting List
        }
        
        return result;
    }
}