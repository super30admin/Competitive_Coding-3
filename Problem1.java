//O(n) time
//O(1) space

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current, prev = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            current = new ArrayList<>();
            current.add(1);

            for(int j = 2;j<i;j++){
                current.add(prev.get(j-1)+prev.get(j-2));
            }
            if(i!=1)
                current.add(1);
            prev = current;
            res.add(current);
        }
        return res;
    }
}