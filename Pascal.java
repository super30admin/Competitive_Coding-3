// Time Complexity :O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode 118 : yes



class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<List<Integer>>();
        if(numRows==0)
            return l;
        for(int i=0;i<numRows;i++){
           List<Integer> in=new ArrayList<Integer>();

        for(int j=0;j<=i;j++){
            if(j==0||j==i)
                 in.add(1);
            else
            in.add(l.get(i-1).get(j-1)+l.get(i-1).get(j));
        }
            l.add(in);
        }
        return
            l;
    }
}