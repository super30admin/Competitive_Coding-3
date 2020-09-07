    
    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/paint-house/
    Time Complexity for operators : o(n2)
    Extra Space Complexity for operators : o(1)...extra hashmap 
    Did this code successfully run on Leetcode : NA
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : Two for loops.
        # Optimized approach: . 
                              
            # 1. Create list and add first element as '1'.
              2. Then iterate thru the for loop. and add previos row's element and left side of that previos element
              3. At the end of middle for loop add it in the list.
              4. Return list.
    */    
import java.util.*;
import java.util.Map.Entry;
public class paskal_triangle_2_119 {
	
	public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex + 1);
        row.add(1);

        for (int i = 0; i < rowIndex; i++) {
          for (int j = i; j > 0; j--) {
            row.set(j, row.get(j) + row.get(j - 1));
          }
          row.add(1);
        }

        return row;
	}
	
	public static void main(String args[]) {
		int k = 3;
        System.out.println(getRow(k));
	}
}


