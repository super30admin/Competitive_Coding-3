//space - O(n)
//time - O(n*n)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        res.add(temp);
        
        if(numRows==1)
            return res;
        
        for(int i=1;i<numRows;i++)
        {
            List<Integer> prev = res.get(i-1);
            
            List<Integer> t1= new ArrayList<>();
            t1.add(1);
            if(prev.size()>=2)
            { for(int j=0;j<prev.size()-1;j++)
            {
                int sum = prev.get(j)+prev.get(j+1);
                t1.add(sum);
            }
                
            }
            t1.add(1);
            res.add(t1);
            
            
            
            
        }
        return res;
        
    }
}