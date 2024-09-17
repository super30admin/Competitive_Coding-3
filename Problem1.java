//Time Complexity: O(n) where n = numRows.
//Space Complexity: O(1). 


class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> ar = new ArrayList<>();
        
        if(numRows == 0)
            return ar;
        
        int sum = 0;
        for(int i = 0; i < numRows;i++)
        {
            ArrayList<Integer> newR = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                
                if( j == 0){
                    newR.add(1);
                }
                
                else if( i == j )
                    newR.add(1);
                else
                {
                    int num1 = ar.get(i-1).get(j-1);
                    int num2 = ar.get(i-1).get(j);
                    newR.add(num1+num2);
                }
            }
            
            ar.add(newR);
            
        }
        
        return ar;
    }
}