// Time Complexity : O(n^2)
// Space Complexity : O (n^2)
// Did this code successfully run on Leetcode: Yes. 
// Any problem you faced while coding this : Implementing List DS

class pascal{
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;
        int firstNum, secondNum;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
            
        
        for(int i = 0; i < n; i++){ // for rows
            List<Integer> rowList =  new ArrayList<Integer>(); //row list
            for(int j = 0; j < i+1; j++){         // for columns, +1 as we will always have an extra column for boundary 1's on right
            
            //As discussed, we will be using boundary 1's for ex. [1,4,6,4,1], the 1's are boundary
            //They will always be located at 0th and last position of the list.
          
            if(j == 0 || j == i)
                rowList.add(1);
            
            //Following the traversal shown in the picture attached.
            else {
                //always in the previous row, so i-1
                firstNum  = result.get(i - 1).get(j - 1);
                secondNum = result.get(i - 1).get(j);
                
                //Add to new row after getting them
                rowList.add(firstNum + secondNum); //addition is commutative so order doesn't matter.
                
            }

        }
            //add row to result
            result.add(rowList);
      
    }
       return result;
 }
}