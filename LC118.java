class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        
        if(numRows == 0){
            return output;
        }
        
        output.add(new ArrayList<Integer>());
        output.get(0).add(1);
        if(numRows == 1){
            return output;
        }
        
        for(int i = 1; i < numRows; i++){
            List<Integer> temp = new ArrayList<Integer>();
            List<Integer> prev = output.get(i-1);
            int size = prev.size();
            temp.add(1);
            for(int j = 1; j < size; j++){
                temp.add(prev.get(j-1) + prev.get(j));
            }
            temp.add(1);
            output.add(temp);
        }
        return output;
    }
}

//Time Complexity: O(n^2) n=numRows
//Space Complexity: O(n)