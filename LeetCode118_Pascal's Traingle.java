//Approach - we take base case as row =0 then just 1, 
// when we at the ith row, we go to the i-1th row and and take the j-1 and j's sum to get the current value. if j is at the border, we just put one!
//time complexity -O(n^2), n = number of rows given. 
//Space complexity - O(n) - we use templist to store the values. 

class Solution {
    
	
	public List<List<Integer>> generate(int numRows) {
	
		//base case
		if(numRows == 0) return new ArrayList<>();
		
		List<List<Integer>> output = new ArrayList<>();
		
		List<Integer> temp = new ArrayList<>();
		temp.add(1); // this defines out first row. 
		output.add(0,temp);
		
		//we will start iterating from the 2nd row, which is i =1;
		for(int i=1; i<numRows ; i++)
		{
		
			//we will get the first value from the output list
			List<Integer> instance = new ArrayList<>(); // to get the i-1st row from th output 
			//run to the individual index of the rows, which is column
			for(int j =0; j<= i; j++)
			{
				if(j ==0 || j==i)
					instance.add(1);
				else
					instance.add(temp.get(j-1) + temp.get(j)); 
			}
			output.add(i,instance);
			temp = instance;
		
		}
		return output;
		
	}

}