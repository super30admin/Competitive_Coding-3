// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No , just did not get enogh time to code this out in mock interview


// Your code here along with comments explaining your approach
// Every list will have 1 at the start and 1 in the end. The rest of the elements would just be addition of current element and next element starting from 
// index 0 upto element just before the last element.
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result  = new ArrayList<List<Integer>>();
        
        if(numRows==0)
        {
          return result;
        }
          
        result.add(new ArrayList<>());
        //put 1 to the top row of the triangle
        result.get(0).add(1);
      
        for(int i=1;i<numRows;i++)
        {
        	
          List<Integer> current = new ArrayList<>();
          //get the values from the above row of triangle
          List<Integer> previous = result.get(i-1);
          //add 1 as the first element of any row of the triangle
          current.add(1);
          //add rest of the elements by adding each element with its next element from the previous row
          for(int j=1;j<i;j++)
          {
            current.add(previous.get(j-1)+previous.get(j));
          }
          //add 1 as the last element on any row of the triangle
          current.add(1);
          
          result.add(current);
        }
      return result;
        }
}