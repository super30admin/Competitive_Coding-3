//time complecity : O(n ), 
//space complexity :o (n ), auxilary space


class Solution {
    public List<List<Integer>> generate(int numRows) {
            
        
        List<List<Integer>> result = new ArrayList<>();
        
        //will start iterating from index 0 to numRows
        
        for(int i = 0 ; i < numRows ; i++){
            //initialise a current level list
            List<Integer> level = new ArrayList<>();
            
            for(int j = 0; j <= i ;j++){
                 //edge cases, where in fill the ends
                if(j == 0 || j == i){
                    level.add(1);
                }
                else{
                    //fetch the previous level from result 
                    List<Integer> prevLevel = result.get(i-1); 
                    int currNum = prevLevel.get(j) + prevLevel.get(j-1);
                    level.add(currNum);
                }
            }
           
            result.add(level);
        }
        
        return result;
    }
}