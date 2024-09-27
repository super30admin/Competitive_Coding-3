// approach -> pt[i][j] = 1 if j = 0 or j = previousRow.size()
//                          pt[i - 1][j] + pt[i - 1][j] otherwise
// the size of each row  = size of prev row + 1
                             
//time - O(n^2) - for the last row, fill n elements considering n - 1 elements in prev row
//space - constant                
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(numRows <= 0)
        {
            return result;
        }
        
        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        
        for(int i = 1; i < numRows; i++)
        {
            List<Integer> previous = result.get(i - 1);
            ArrayList<Integer> current = new ArrayList<>();
            
            for(int j = 0; j <= previous.size(); j++)
            {
                if(j == 0 || j == previous.size())
                {
                    current.add(1);
                }
                else
                {
                    int one = previous.get(j - 1);
                    int two = previous.get(j);
                    int currentElement = one + two;
                    current.add(currentElement);
                }
            }
            result.add(current);
        }
        return result;
    }
}
