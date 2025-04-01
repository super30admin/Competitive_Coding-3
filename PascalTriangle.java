// Time Complexity : O(N2)
// Space Complexity : O(N2)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> resultList = new ArrayList<>();
       List<Integer> prevRowElements = new ArrayList<>();
       if( numRows < 1) return resultList;
       prevRowElements.add(1);
       resultList.add(prevRowElements);
       for(int i=1; i<numRows; i++) {
        List<Integer> rowElements = new ArrayList<>();
         rowElements.add(1);
        for(int j=1; j<i; j++) {
            rowElements.add(prevRowElements.get(j)+ prevRowElements.get(j-1));
        }
        rowElements.add(1);
         prevRowElements = rowElements;
         resultList.add(rowElements);
       }

       return resultList;
    }
}