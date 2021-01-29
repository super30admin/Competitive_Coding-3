// Time Complexity : O(n^2), n*(n+1)/2 elements
// Space Complexity : O(n^2), considering output space
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach
// for j!=0 and j!=curRow-1, pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j], else its 1

class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0)
            return new ArrayList<List<Integer>>();
        
        ArrayList<List<Integer>> pascal = new ArrayList<List<Integer>>();        
        
        pascal.add(Arrays.asList(1));
        
        for(int i=2; i<=numRows; i++){
            ArrayList<Integer> row = new ArrayList<Integer>();
            
            row.add(1);
            
            for(int j=1; j<i-1; j++){
                row.add(pascal.get(i-2).get(j-1) + pascal.get(i-2).get(j));
            }
            
            row.add(1);
            
            pascal.add(row);
        }
        
        return pascal;
    }
}
