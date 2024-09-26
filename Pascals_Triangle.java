// Time Complexity : O(n*n) n:ArrayLength
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();
        
        //Adding the first row that is first list containing "1" in it.
        int myInt = 1;
        List<Integer> list = new ArrayList<Integer>();
        list.add(myInt);
        l.add(list);
        
        //Next adding each line in the list till n 
        for(int i=1;i<numRows;i++){
            
            //creating a list to add the elements for that particular row.
            list = new ArrayList<>();
            list.add(1); //in that particular row first element will be always "1"
            int n = l.get(i-1).size();
            
            //Now from 2nd element caluclating the sum of above two elements in the previous row.
            for(int j=0;j<n-1;j++){
                int s  = l.get(i-1).get(j) + l.get(i-1).get(j+1);
                list.add(s);
            }
            list.add(1); //last element will be always "1".
            l.add(list); //Adding this list to the final list.
        }
        return l;
    }
}
