package WeeklyInterviews;

import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        
    /* 
	Time Complexity: O(n^2) .
	Because nested loop till n in last iteration of outer FOR loop.

	Space Complexity: O(1)
	Lists are part of the final result of the function, hence not counted towards extra space.
	      
	Did this code successfully run on Leetcode : Yes

	Any problem you faced while coding this : No

	Approach:
	If n = 5, pascal triangle will have 5 rows.
    Every row will have as many number of elements as the row count.
    1
    1   1
    1   2   1
    1   3   3   1
    1   4   6   4   1
    Ith loop will loop 4 times since first row is created before the loop.
    Nested Jth loop will populate elements in a row/level. 
    First and last '1' will be added for a row.
    
    Sublist for a level is added to the main list.
 
	*/
       
        List<List<Integer>> res = new ArrayList<>();
            
        // edge
        if (numRows == 0) {
            return res;
        }
        
        // creating sublist for first row of the pascal's triangle and adding 1 to it
        // adding first row sublist to result list of list 
        List<Integer> first = new ArrayList<>();
        first.add(1);
        res.add(first);
        
        // creating sublists(for each level) from 2nd row to Nth row and adding each sublist to result list of list
        for (int i = 1; i < numRows; i++) {
            // creating sublist for a level/row of pascals triangle 
            // adding first '1' to a sublist for the current level,i.e.Ith level
            List<Integer> level = new ArrayList<>();
            level.add(1);
            
            // adding elements between the first and last 1 on a row/level
            for (int j = 1; j < i; j++) {
                List<Integer> prev = res.get(i-1);
                int temp = prev.get(j-1) + prev.get(j);
                level.add(temp);
            }
            
            // adding last '1' to a sublist for the current level,i.e.Ith level
            level.add(1);
            // adding sublist for a level to result list of list
            res.add(level);
        }
        
        return res;
        
    }
}
