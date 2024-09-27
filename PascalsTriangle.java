// Time Complexity : O(numRows^2) where numRows is the input
// Space Complexity : O(n + numRows^2 ) where n is the number of elements in temporary list in the numRows level numRows^2 because we will storing numRows^2 in the result array;
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        List<Integer> tmpList = new LinkedList<Integer>();
        
        for(int i=1;i<=numRows;i++){
            tmpList.add(0,1);
            for(int j=1;j<tmpList.size()-1;j++){
                tmpList.set(j, tmpList.get(j)+tmpList.get(j+1));
            }
            result.add(new LinkedList<>(tmpList));
        }
        return result;
    }
}