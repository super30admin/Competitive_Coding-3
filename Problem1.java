// TC: O(n^2)
// SC: O(1)
// n - numRows

/*

n = 5

1	|	1	
2	|	1	1
3	|	1	2	1
4	|	1	3	3	1
5	|	1	4	6	4	1	

*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < numRows; i++ ){
            List<Integer> innerLi = new ArrayList<>();
            innerLi.add(1);
            for(int j = 1; j <= i; j++){
                if(j == i){
                    innerLi.add(1);
                } else {
                    innerLi.add(res.get(i - 1).get(j) + res.get(i - 1).get(j - 1));
                }                
            }
            res.add(innerLi);
        }
        return res;
    }
}