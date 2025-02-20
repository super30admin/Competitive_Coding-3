/*Time Complexity: O(n*n)
Space Complexity: O(n) for storing previous result to calculate the current result.
Leetcode: yes
Any Issues: NO
*/
import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        List<Integer> temp = new ArrayList<>();
        temp.add(1);

        result.add(temp);
        if(numRows == 1)
            return result;
            
        for(int i=1; i<numRows; i++)
        {
           List<Integer> tempx = new ArrayList<>();
           List<Integer> lst = result.get(result.size()-1);
           tempx.add(1);
           for(int j=1; j<lst.size(); j++)
           {
                tempx.add(lst.get(j-1)+lst.get(j));
           }
            tempx.add(1);
            result.add(tempx);
        }
        return result;
    }
}