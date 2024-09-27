// Time Complexity : O(n*n)
// Space Complexity : O(1)


public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri = new ArrayList<>();
        
        if(numRows ==  0 ) return tri;
        
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        tri.add(first_row);
        
        for (int i = 1 ; i<numRows; i++){
            List<Integer> prev_row = tri.get(i-1);
            List<Integer> curr_row = new ArrayList<>();
            curr_row.add(1);
            
              for (int j = 1 ; j<i; j++){
                  curr_row.add(prev_row.get(j-1) + prev_row.get(j) );
              }
            curr_row.add(1);
            tri.add(curr_row);
        }
        return tri;
    }
}
