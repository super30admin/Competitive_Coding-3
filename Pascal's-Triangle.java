class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    list.add(1);
                }else{
                    int val1 = result.get(i-1).get(j);
                    int val2 = result.get(i-1).get(j-1);
                    list.add(val1 + val2);
                }
            }
            result.add(list);
        }
        return result;
    }
}

// Time Complexity : O(n * n)
// Space Complexity : O(1)