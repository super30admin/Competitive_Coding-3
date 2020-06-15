// Time Complexity : O(k*n).  k is the number of rows. n is the number of total number of elements in all rows  
// Space Complexity : O(k+n). k is the number of rows. n is the number of total number of elements in all rows 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
       if (numRows == 0)
			return new ArrayList<List<Integer>>();
		ArrayList<List<Integer>> arrayList=new ArrayList<List<Integer>>();
		List<Integer> arl;
		for (int i = 1; i <= numRows; i++) {
			arl=new ArrayList();
			if (i == 1) {
				arl.add(1);
				arrayList.add(arl);
				continue;
			} else if (i == 2) {
				arl.add(1);
				arl.add(1);
				arrayList.add(arl);
				continue;
			}
			List<Integer> list = arrayList.get(i - 2);
			for (int j = 0; j < i; j++) {
				if (j == 0 || j == i - 1) {
					arl.add(1);
				} else if (j - 1 >= 0 && j != i - 1) {
					arl.add(list.get(j) + list.get(j - 1));
				}
			}
			arrayList.add(arl);
		}
		
		return arrayList;        
    }
}
