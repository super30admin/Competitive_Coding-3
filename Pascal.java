// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

class Pascal{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> curRow = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    curRow.add(1);
                } else{
                    curRow.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            result.add(curRow);
        }
        return result;
    }
}