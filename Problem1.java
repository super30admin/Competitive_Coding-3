//Time Complexity: O(n^2), where n is the given numRows value
//Space Complexity: O(1), since the problem itself requires a List Output.
//Code run successfully on LeetCode.

public class Problem1 {

    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        result.add(new ArrayList<>());
        result.get(0).add(1);
        
        
        for(int j =1; j < numRows; j++){
            
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = new ArrayList<>();
            
            prevRow = result.get(j-1);
            
            for(int i =0; i < prevRow.size() +1; i++)
            {
                if(i ==0|| i== prevRow.size())
                    row.add(1);
                
                else
                {
                    row.add(prevRow.get(i-1) + prevRow.get(i));
                }
            }
            result.add(row);
        }
        return result;
    }
}
