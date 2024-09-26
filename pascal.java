time complexity: O(numRows)
space complexity: O(n)

class Solution { 
    public List<List<Integer>> generate(int numRows) {
    ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
	if (numRows <= 0) //initial check
		return result;
 
	ArrayList<Integer> pre = new ArrayList<Integer>();
	pre.add(1); //adding 1 to the lists
	result.add(pre);
 
	for (int i = 2; i <= numRows; i++) { 
		ArrayList<Integer> cur = new ArrayList<Integer>();
 
		cur.add(1); //first element
		for (int j = 0; j < pre.size() - 1; j++) {
			cur.add(pre.get(j) + pre.get(j + 1)); //middle element by adding previous elements
		}
		cur.add(1);//last element
 
		result.add(cur);
		pre = cur;
	}
 
	return result;
    }
}