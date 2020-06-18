// Time Complexity : O(n^2) where n is number of rows
// Space Complexity :O(n^2) where n is number of rows
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Pascal {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows==0) return result;
        for(int i=0;i<numRows;i++)
        {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            if(result.size()>0)
            {
                
               for(int j=0;j<result.get(result.size()-1).size()-1;j++)
                {
                    List<Integer> recentList = result.get(result.size()-1);
                    list.add(recentList.get(j)+recentList.get(j+1));
                }
                list.add(1);
            }
            result.add(list);
            
        }
        return result;
        
    }
}