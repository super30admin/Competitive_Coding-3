// Time complexity: O(n^2)
// Space complexity: O(n)

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> generate(int numRows) {
       
        
        //Edge case
        if(numRows == 0){
            return new ArrayList<>();
        }
        helper(numRows-1);           
            
        
        return result;
    }
    
    
    public List<Integer> helper(int numRows){
        
        if(numRows == 0){
            List<Integer> rows = new ArrayList<>();
            rows.add(1);
            result.add(rows);
            return rows;
        }
        
        List<Integer> a = helper(numRows-1);
        List<Integer> b = new ArrayList<>();
        for(int j = 0; j <= numRows; j++){            
            if(j == 0 || j == numRows){
                b.add(1);
            }
            else{
                int left = a.get(j-1);
                int right = a.get(j);
                b.add(left+right);
            }
        }
        result.add(b);
        return b;
    }
}

