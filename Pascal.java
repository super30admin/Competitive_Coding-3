//time complexity: O(n^2)
//space complexity:O(n)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i) 
                    row.add(1);//add one at both the ends 
                else
                {
                int left=arr.get(i-1).get(j-1);//accessing the previous row and left 
                //element
                int right=arr.get(i-1).get(j);//accessing the previous row and element 
                //to the right
                row.add(left+right);
                }
            }
            arr.add(row);
        }
        
        return arr;
    }
}
