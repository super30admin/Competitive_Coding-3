// Time Complexity : O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None.


// Your code here along with comments explaining your approach
class Solution {
	public List<List<Integer>> generate(int numRows) {
		 List<List<Integer>> res = new ArrayList<>();
		 
		 for(int i = 0; i < numRows; i++) {
			  List<Integer> in = new ArrayList<>();
			  if(i == 0) {
					in.add(1);
			  } else if(i == 1) {
					in.add(1);
					in.add(1);
			  } else {
					in.add(1);
					List<Integer> prev = res.get(i-1);
					for(int j = 1; j < i; j++) {
						 in.add(prev.get(j-1) + prev.get(j));
					}
					in.add(1);
			  }
			  res.add(in);
		 }
		 return res;
	}
}