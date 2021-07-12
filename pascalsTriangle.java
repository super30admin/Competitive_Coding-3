//TC: O(N^2)
//SC: O(1)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        List<Integer> f = new ArrayList<>();
        f.add(1);
        result.add(f);
        
        for(int i=1; i<numRows; i++) {
            List<Integer> l = new ArrayList<>();
            l.add(1);
            for(int j=1; j<i; j++) {
                l.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            l.add(1);
            result.add(l);
        }
        
        return result;
    }
}