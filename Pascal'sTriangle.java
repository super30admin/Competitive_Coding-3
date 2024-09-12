// TC: O(N^2))
// SC: O(1) FOR NO AUXILARRY SPACE AND O(N^2) FOR ANSWER


class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        
        
        if(numRows == 0)
            return answer;
        
        answer.add(new ArrayList<Integer>());
        
        answer.get(0).add(1);
        
        for(int row=1;row<numRows;row++){
            
            List<Integer> innerList = new ArrayList<Integer>();
            
            List<Integer> previousList = answer.get(row-1);
            
            innerList.add(1);
            for(int j=1;j<row;j++){
                innerList.add(previousList.get(j-1) + previousList.get(j));
            }
            innerList.add(1);
            
            
            answer.add(innerList);
            
            
        }
        
        
        return answer;
    }
}