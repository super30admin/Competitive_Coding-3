/**
Time Complexity :O(N) 
Space Complexity :O(1)
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this :no
**/
class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        
        List<List<Integer>> output = new ArrayList<>();
        
        
        for(int i =0;i < numRows; i++){
            
            List<Integer> level = new ArrayList<>();
            
            for(int j =0; j <= i; j++)
            {
                
                if(j == 0 || j ==i) level.add(1);
                else
                {
                    List<Integer> previous = output.get(i-1);
                    level.add(previous.get(j-1) + previous.get(j));
                }
                
            }
            
            output.add(level);
        }
        
        
        
        return output;
        
    }
}