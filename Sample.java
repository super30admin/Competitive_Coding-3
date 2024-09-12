
//Pascals
// Time Complexity : O(mxn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

//for (int i = 0; i < numRows; i++) {
//			List<Integer> rowIndex = new ArrayList<>();
//			for (int j = 0; j <= i; j++) {
//				if (j == 0 || j == i) { // checking extreme left and right position
//					rowIndex.add(1); // each row with extreme left and extreme right positioned values will be 1
//				} else {
//					int left = result.get(i - 1).get(j - 1); // getting extreme left value
//					int right = result.get(i - 1).get(j); // getting extreme right value
//					rowIndex.add(left + right); // middle values
//
//				}
//			}

//k-diff pairs