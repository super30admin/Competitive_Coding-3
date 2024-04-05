//118. Pascal's Triangle
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(1);
        ans.add(l);
        int row = 2;
        while (row <= numRows){
            l = genRow(l);
            ans.add(l);
            row++;
        }
        return ans;
    }
    public List<Integer> genRow(List<Integer> list){
        List<Integer> a = new ArrayList<>();
        int prev = 0;
        for(int x : list){
            a.add(prev + x);
            prev = x;
        }
        a.add(1);
        return a;
    }
}
