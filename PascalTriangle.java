/**
Problem: Pascal Triangle
Time Complexity: O(n*n), where n is the number of rows
Space Complexity : O(1), as we don't use any auxiliary structure.

Did it run on LeetCode : Yes.

Approach : Straighforward.
1. The first and last elements of every row are 1
2. The numbers in between are the sum of elements of the previous row's current column and previous row's previous column.
3. In the end, we append the inner list to the result list, and return the result.

 */



class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            List<Integer> innerList = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
              if(i == j || j == 0) {
                innerList.add(1);
            }
            else {
                innerList.add((result.get(i-1).get(j-1) + result.get(i-1).get(j)));
            }  
            }
            result.add(innerList);
        }
        return result;
    }
}