//Array spiral
// Time Complexity : O(N^2)
//Space Complexity : O(N) 
//Did this code successfully run on Leetcode : Yes

class Solution {
    public List<Integer> getRow(int rowIndex) {
        
         List<List<Integer>> result = new ArrayList<>();

        //edge
        if(rowIndex == 0)
            return  new ArrayList<>(Arrays.asList(1));

        for(int i = 0; i <= rowIndex; i++) {
			List<Integer> rowArray = new ArrayList<>();
            for(int j = 0; j <= i; j++) {

				//corner elements are 1
				if(j == 0 || j == i)
                    rowArray.add(1);
                else {
					//rest element in the middle
                    int left = result.get(i-1).get(j-1);
                    int right = result.get(i-1).get(j);
                    rowArray.add(left + right);
                }    
            }
            result.add(rowArray);
        }
        return result.get(rowIndex);
    
    }
}