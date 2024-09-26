// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> arr1= new ArrayList<>();
        
        for(int i=0;i<numRows; i++){
            arr1.add(0,1); //Add 1 at index 0 and numRows-1 as this will always be 1
            for(int j=1; j<arr1.size()-1; j++){
                arr1.set(j,arr1.get(j)+arr1.get(j+1)); //other than first and last element of list, perform addition for inbetween elements from previous row
            }
            arr.add(new ArrayList<>(arr1));
        }
        return arr;
    }
}