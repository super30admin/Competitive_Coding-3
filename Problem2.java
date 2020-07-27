// There are two approaches
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

import java.util.ArrayList;
import java.util.List;
// Your code here along with comments explaining your approach

// Approach 1
// Time Complexity : O(k^2)
//      k: row index of pascal triangle
// Space Complexity : O(k)
//      k: row index of pascal triangle
class Problem2S1 {

    /** Pascal triangle kth row */
    public List<Integer> getRow(int rowIndex) {
        
        // result
        List<Integer> result =  new ArrayList<>();

        //edge case
        if(rowIndex<0)
            return result;
        
        // temporary array to store calculation
        int[] temp = new int[rowIndex+1];
        // first row value
        temp[0] = 1;

        // the second row
        for(int i=1; i<rowIndex+1; i++){
            
            // previous value 1st value that is Oth
            int prev = temp[0];
            // iterate
            for(int j=1;j<i; j++){
                // prev + current value 
                temp[j] = temp[j] + prev;
                // update previous
                prev = temp[j] - prev;
            }
            // last value is always 1
            temp[i] = temp[0];
        }

        // converting int[] -> List<Integer>
        for(int element:temp)
            result.add(element);
        
        // return result
        return result;
    }
}

// Approach 2
// Time Complexity : O(k^2 + k) = O(k^2)
//      k: row index of pascal triangle
//      O(k): initializing result list
// Space Complexity : O(1)
//      Not counting resultant list
class Problem2S2{

    /** Pascal triangle kth row */
    public List<Integer> getRow(int rowIndex) {

        // edge case
        if(rowIndex<0)
            return new ArrayList<Integer>();

        // result && initializig with 1
        List<Integer> result =  new ArrayList<Integer>(rowIndex+1);
        for(int i=0; i<rowIndex+1;i++)
            result.add(1);
        
        // iterating
        for(int i=1; i<rowIndex+1; i++){
            
            // previous
            int prev = result.get(0);
            for(int j=1;j<i; j++){

                // updating current as previous Cal + prev
                result.set(j, result.get(j) + prev);

                // updating prevCal to previous
                prev = result.get(j) - prev;
            }

        }
        
        // return result
        return result;
    }
}