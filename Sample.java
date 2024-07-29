//Problem 1
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

class Solution {
    public int findPairs(int[] nums, int k) {
        int count=0;
        Map<Integer,Integer> hm= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
        else{
                hm.put(nums[i],1);
        }
        
        }
   System.out.println("hashmap"+hm);
      for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
    int key = entry.getKey();
    int value = entry.getValue();
    if(k==0)
    {
        if(value>1) 
        {
            count++;
        }
    }
    else if(hm.containsKey(key+k))
    {
        count++;
    }

    
   
}
        return count;
        
    }
}
//Problem 2
// Time Complexity :O(n*n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> res,prev=null;
        for(int i=0;i<numRows;++i)
        {
            res=new ArrayList<Integer>();
            for(int j=0;j<=i;++j)
            {
                if(j==0||j==i)
                {
                    res.add(1);
                }
                else{
                    res.add(prev.get(j-1)+prev.get(j));

                }
               
            }
             prev=res;
                result.add(res);
        }
        return result;
        
    }
}