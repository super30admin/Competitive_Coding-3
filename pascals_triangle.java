//Time Complexity: O(numRows^2);
//Space Complexity: O(numRows^2);

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans = new ArrayList<List<Integer>>();
        if(numRows == 0)
            return ans;
        for(int i=0;i<numRows;i++)
        {
            List<Integer>list = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    list.add(1);
                }
                else
                {
                    int left = ans.get(i-1).get(j-1);
                    int right = ans.get(i-1).get(j);
                    list.add(left+right);
                }
            }
            ans.add(list);
        }
        return ans;
        
    }
}