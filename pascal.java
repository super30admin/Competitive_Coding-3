//time complexity : O(n^2)
//space complexity : O(n)


class Solution {
    public List<List<Integer>> generate(int numRows) {
       int sum=0;
    List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> prev_row = new ArrayList<>();
        prev_row.add(1);
        pascal.add(prev_row);
        for(int i =1;i<numRows;i++)
        {
            List<Integer> current = new ArrayList<>();
            current.add(1);
        for(int j=1;j<i;j++)
        {
            current.add(pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j));
        }
            current.add(1);
            pascal.add(current);
        }
        return pascal;
    }
}