/*
 * Time Complexity : O(n^2)
 * Space Complexity :  O(1)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 * 
 * Approach - Here the first 2 rows of the triangle is common and can be considered the starting point for the next rows to be generated. 
 * Given the number of rows required we calculate the subsequent elements of the next row by adding the ith and i-1th element of the previous row. We append 1 to the 
 * new row at the beginning and at the end. 
 */

//https://leetcode.com/problems/search-a-2d-matrix-ii/description/
class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        Integer[] res;
        List<List<Integer>> result = new ArrayList<>();
        res=new Integer[1];
        res[0]=1;
        result.add(Arrays.asList(res));
        if(numRows==1) return result;
        res=new Integer[2];
        res[0]=1;
        res[1]=1;
        result.add(Arrays.asList(res));
        if(numRows==2) return result;
        for(int j=3;j<=numRows;j++){
            Integer[] prevRow = res;
            res=new Integer[j];
            res[0]=1;
            int i=1;
            for(i=1;i<=prevRow.length-1;i++){
                res[i]=prevRow[i]+prevRow[i-1];
            }
            res[i]=1;
            result.add(Arrays.asList(res));
        }
        return result;
    }
}