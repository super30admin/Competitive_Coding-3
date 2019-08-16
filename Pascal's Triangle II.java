/*
Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.

Note that the row index starts from 0.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 3
Output: [1,3,3,1]
Follow up:

Could you optimize your algorithm to use only O(k) extra space?
*/

//This is using the formual of Binomial Coeffecient for the Pascal triangle

// T: O(k)
// S: O(k)

class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        int a = 1;
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        
        
        if(rowIndex == 0)   return result;
        
        
        
        for(int i = 1; i < rowIndex; i++){
            
            a = (int) (a * (double) (rowIndex - i + 1) / i) ;
            result.add(a);
        }
        
        result.add(1);
        
        return result;
        
    }
}