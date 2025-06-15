/*
 * Time Complexity: O(n^2) Iterating through previous lists created to build current list
 * Space Complexity: O(n^2) Used two lists, sub solution and main solution
 */

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j== i){
                    row.add(1);
                }
                else{
                    row.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            res.add(row);
        }
        return res;
    }
}