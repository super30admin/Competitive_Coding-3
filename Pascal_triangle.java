//Time complexity: O(n^2)
//Space complexity: O(1)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>res= new ArrayList<List<Integer>>();
        
        for(int i=0;i<numRows;i++)
        {
            ArrayList<Integer> a=new ArrayList<Integer>();
            
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                    a.add(1);
                else
                {
                    int x= res.get(i-1).get(j-1)+res.get(i-1).get(j);
                    a.add(x);
                }
            }
            res.add(a);
        }
        return res;
    }
}