// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
lass Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> initial = new ArrayList<>();
        initial.add(1);
        res.add(initial);        
       
        for(int i =1; i<numRows ;i++){
            
            List<Integer> curr_row = new ArrayList<>();
            curr_row.add(1);
            
            for(int j=1; j<=i-1; j++){
                curr_row.add(res.get(i-1).get(j) + res.get(i-1).get(j-1));
                
            }
            curr_row.add(1);
            res.add(curr_row);
            
        }
        return res;
        
    }
}