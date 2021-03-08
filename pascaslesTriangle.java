class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        if(numRows == 0){
            return triangle;
        }
        
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        
        for(int i = 1; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prev = triangle.get(i-1);
            
            // first value of a row is always 1 in pascales triangle
            row.add(1);
            
            for(int j = 1; j < i; j++){
                row.add(prev.get(j-1) + prev.get(j));
            }
            
            // last value of a row is always 1 in pascales triangle
            row.add(1);
            
            triangle.add(row);
        }
        
        return triangle;
    }
}
//Time Complexity: O(n^2)
// Space Complexity: O(n^2)

// n --> number of rows