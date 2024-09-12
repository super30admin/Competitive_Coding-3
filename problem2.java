// Time Complexity : O(numRows^2)
// Space Complexity : O(numRows^2)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach



class problem2 {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result=new ArrayList<>();
        
        if(numRows==0)
            return result;
        
        //base row =1 
        List<Integer> FirstRow=new ArrayList<>();
        FirstRow.add(1);
        result.add(FirstRow);
        
        //row after 1
        
        for(int i=1;i<numRows;i++){
            
            List<Integer> previous= result.get(i-1);
            List<Integer> current=new ArrayList<>();
            current.add(1);
            
            for(int j=1;j<i;j++){
                current.add(previous.get(j-1)+previous.get(j));
            }
                        
            current.add(1);
            result.add(current);            
            
        }
        return result;
    }
}