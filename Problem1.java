//Problem: Pascals-triangle
// Time Complexity : O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0; i<numRows ;i++){
            List<Integer> row = new ArrayList<>();

            for(int j=0; j<=i; j++){
                if(j==0 || j==i){ // first and last element of a row it will always 1
                    row.add(1);
                } 
                else{
                    int sum = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                    row.add(sum);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}