// TC : O(n^2)
// SC : O(1)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        // if(numRows == 0) return new ArrayList<>();
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        
        // for rownum = 1, initialise 1 for the first row
        if(numRows == 1 || numRows>1){
            List<Integer> result = new ArrayList<Integer>();
            result.add(1);
            output.add(result);
            
        }
        // for rownum = 2, initialise 2 for the second row
        if(numRows == 2 || numRows>2){
            List<Integer> result = new ArrayList<Integer>();
            result.add(1);
            result.add(1);
            output.add(result);
            
        }
        // for rownum=3 and greater add 1s at extremes and compute the sum and add to list
        for(int row=3;row<=numRows;row++){
            List<Integer> prev = output.get(row-2);
            List<Integer> curr = new ArrayList<>();
            int count =1;
            int i=0;
            curr.add(1);
            while(count<row-1){
                curr.add(prev.get(i)+prev.get(i+1));
                i=i+1;
                count++;
            }
            curr.add(1);
            output.add(curr);
        }
        
        return output;
    }
}