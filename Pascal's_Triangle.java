class Solution {
    //Time O(N^2)
    //Space O(1)
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(Arrays.asList(1));
        if(numRows == 1)
        {
            return result;
        }
        result.add(Arrays.asList(1,1));
        for(int i=2 ; i<numRows ; i++)
        {
            List<Integer> lis = new ArrayList<>();
            lis.add(1);
            for(int j=1 ; j < i ; j++)
            {
                int sum = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                lis.add(sum);
            }
            lis.add(1);
            result.add(lis);
        }
        return result;
    }
}