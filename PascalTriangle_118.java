/*
Time complexity: O(numRows^2) time for both iterative and recursive approaches
Space complexity: O(1) auxilliary space for iterative and O(1) stack space for recursive
*/


// ===================================== Iterative approach ==========================================

/*
Algorithm:
=========
1. To generate n rows with O(1) space, use list of lists class variable, where every row's previous row can be used to generate next one unless if it is first or second row. 
2. Add empty arraylist before generating elements for that row. 
3. If first or last element of that row is being generated, it is definitely going to be "1". 
4. If not, sum up previous row's elements at that index and index-1
*/
class Solution {
    
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> generate(int numRows) {    
        if(numRows == 0) return result; // empty result
        pascal(numRows);
        return result;
    }
    
    private void pascal(int numRows) {
        if(result.size() == numRows) return;    //check if pascal triangle is already generated for n rows
        
        for(int i = 0; i < numRows; i++) {
            result.add(new ArrayList<Integer>()); //new array list for every row
            int len = result.size()-1; 
            for(int j = 0; j <= i; j++) {       //generate each row values
                if(j == 0 || i == j)
                    result.get(len).add(1);     //Add 1 to the list if beginning or end of each row
                else {
                    int curr = result.get(len-1).get(j) + result.get(len-1).get(j-1); //Otherwise, calculate sum from previous row values
                    result.get(len).add(curr);  //add sum value to current row in the triangle
                }
            }
        }
        return;
    }
}
// ===================================== Recursive approach ==========================================

/*
1. Only difference between recursive and iterative approaches is utilizing the size of the list of lists instead of using for loop
for calculating which row is being generated.
2. Stack space is still O(1) as we are processing the entire n-1th step before calling nth step.So, at any point of time, only one 
instance of "pascal method" is on stack.
*/
class Solution {
    
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> generate(int numRows) {    
        if(numRows == 0) return result; // empty result
        pascal(numRows);
        return result;
    }
    
    private void pascal(int numRows) {
        if(result.size() == numRows) return;    //check if pascal triangle is already generated for n rows
        
        result.add(new ArrayList<Integer>()); //new array list for every row
        int len = result.size()-1; 
        for(int j = 0; j <= len; j++) {       //generate each row values
            if(j == 0 || len == j)
                result.get(len).add(1);     //Add 1 to the list if beginning or end of each row
            else {
                int curr = result.get(len-1).get(j) + result.get(len-1).get(j-1); //Otherwise, calculate sum from previous row values
                result.get(len).add(curr);  //add sum value to current row in the triangle
            }
        }
        pascal(numRows);
    }
}