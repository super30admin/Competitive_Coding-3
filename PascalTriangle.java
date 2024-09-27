/*
This approach solves the pascal triangle by generating values that are the sum of the value directly above it,
and the value that is above and left of it. The first two rows, and all the first and last elements are set to
the value of 1.

Did this code run on leetcode: Yes
*/
class Solution {
    //Time Complexity: O(n^2)
    //Space Complexity: O(1)
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        if(numRows == 0)
            return result;
      
        for(int i = 1; i <= numRows; i++)
        {   
            List<Integer> li = new ArrayList<>();
            
            for(int j = 1; j <= i; j++)
            {
                if(j == 1 || j == i)
                    li.add(1);
                
                else
                    li.add(result.get(i-2).get(j-1) + result.get(i-2).get(j-2));
            }
            
            result.add(li);
        }
        
        return result;
    }
}