//TC : o(n^2)
//SC : o(n)
//https://leetcode.com/problems/pascals-triangle/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i= 0; i<numRows; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<=i;j++){
                if(j==0 || j==i) list.add(1);
                else{
                    int left = result.get(i-1).get(j-1);
                    int right = result.get(i-1).get(j);
                    list.add(left+right);
                }
            }
            result.add(list);
        }
        return result;
    }
}
