/*
Desc: for size 1 and 2 base cases default code is written, for rest of the rows the logic
that the element is the sum of the current index and the previous index of the previous row is used to fill.
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> lol= new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        outer.add(first);
        if(numRows==1) return outer;
        lol.add(1);
        lol.add(1);
        outer.add(lol);
        if(numRows==2) return outer;
        for(int i=2;i<numRows;i++){
            List<Integer> prev = outer.get(i-1);
            List<Integer> inner= new ArrayList<>();
            inner.add(1);
            for(int j=1;j<i;j++){
                inner.add(prev.get(j-1)+prev.get(j));
            }
            inner.add(1);
            outer.add(inner);
        }
        return outer;
    }
}
