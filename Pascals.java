//T.C: O(n^2) n: no. of rows
//S.c: O(1)

/*Approach: Loop though the rows. At each iteration i will add the value by fetching it 
from the previous list.
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        

        for(int i =0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();

            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                row.add(1); 
                continue;
                } 
                row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            result.add(row);
        }


       return result; 
    }
}