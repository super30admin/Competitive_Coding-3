// Time Complexity : O(n^2) where n is the numRows
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// CODE

public class Pascals_Traingle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();  //creating a new list that will contain all the rows
            res.add(new ArrayList<>());  //adding an empty list to res
            res.get(0).add(1);  //adding element 1 as first row/list in res 
            
            for(int i=1;i<numRows;i++){  
                List<Integer> curr = new ArrayList<>();  //making a new list to store each row
                curr.add(1);  //adding 1 in beginning of each row
                for(int j=1;j<i;j++){  //each row has i-1 spaces to be filled
                    curr.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));  //getting element from previous row (j-1)th index and jth index
                }
                curr.add(1);  //adding 1 at the end of each row
                res.add(curr);  //adding curr list as row to res
            }
            return res;
    }
}
