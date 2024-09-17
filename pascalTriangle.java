class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalList = new ArrayList<>();
 
	List<Integer> previous = new ArrayList<>();
	previous.add(1); //adding '1' in first row
	finalList.add(previous); // adding row 1 in the finalList
 
	for (int i = 2; i <= numRows; i++) {
		List<Integer> current = new ArrayList<>();
 
		current.add(1); //adding first element of the row
		for (int j = 0; j < previous.size() - 1; j++) {
			current.add(previous.get(j + 1) + previous.get(j )); //adding middle element of the row
		}
		current.add(1);  //adding last element of the row
 
		finalList.add(current);
		previous = current; //setting current to previous for next iteration
	}
 
	return finalList;
}
    }

