/**

TC - O(numRows)^2
SC - O(numRows)^2

**/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        final List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0)
        {
            return result;
        }
        
        List<Integer> previous = new ArrayList<>();
        
        for (int i =0; i<numRows; i++)
        {
            if (i == 0)
            {
                previous.add(1);
                result.add(previous);
                continue;
            }
            
            List<Integer> row = new ArrayList<>();
            row.add(1);
            
            for (int j=1; j<i; j++)
            {
                row.add(previous.get(j-1) + previous.get(j));
            }
            
            row.add(1);
            
            result.add(row);
            previous = row;
        }
        
        return result;
        
    }
}