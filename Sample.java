// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

//https://leetcode.com/problems/pascals-triangle/description/


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();
        List<Integer> frow=new ArrayList<>();
        frow.add(1);
        triangle.add(frow);
        for(int i=1;i<numRows;i++)
        {
            List<Integer> prev_row=triangle.get(i-1);
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++)
            {
                row.add(prev_row.get(j)+prev_row.get(j-1));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}


// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes

//https://leetcode.com/problems/k-diff-pairs-in-an-array/description/

class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key:map.keySet())
        {
            if(k==0 && map.get(key)>1)
            {
                count++;
            }
            else if(map.containsKey(key-k) && k!=0)
            {
                count++;
            }
        }
        return count;   
    }
}