/**LC-118
 * Time Complexity : O(N^2) N: Input (Number of Rows)
 * Space Complexity : O(1) 
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
 *
 Algorithm:
 1. Fixed 1st and 2nd row of the result List with arrays [1] and [1,1]
 2. for i=2; i< result.length; i++
    3. reset low and high to 0
    4. for each j iteration, 
        5.add low and high index from i-1 row
    6. add array in the result 
7. Return result

 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
    
        List<List<Integer>> result = new  ArrayList<>();
        if(numRows == 0) return result;
        if(numRows == 1){
            result.add(Arrays.asList(1));
             return  result;
        } 
        if(numRows == 2){
            result.add(Arrays.asList(1));
            result.add(Arrays.asList(1,1));
             return  result;
        }
        result.add(Arrays.asList(1));
        result.add(Arrays.asList(1,1));
        
        for(int i = 2; i < numRows; i++){
            List<Integer> a = new ArrayList<Integer>();
            int low = 0;
            int high = 1;
            
            a.add(1);
            
            
            for(int j = 1; j< i; j++ ){
                a.add(result.get(i - 1).get(low) +  result.get(i - 1).get(high));
                low++;
                high++;
            }
            a.add(1);
            result.add(a);
        }
        
        return result;
        
    }
}