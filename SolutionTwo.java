
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
class SolutionTwo {
    public int findPairs(int[] nums, int k)
    {

        if(nums==null||nums.length==0)
            return 0;

        int result=0;

        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++)
        {
            if(hmap.containsKey(nums[i]))
            {
                int value=hmap.get(nums[i]);
                value++;
                hmap.put(nums[i],value);
            }
            else
            {
                hmap.put(nums[i],1);
            }
        }

        for (Map.Entry <Integer, Integer> entry: hmap.entrySet())
        {
            int key = entry.getKey();
            int value = entry.getValue();

            if( k>0 && hmap.containsKey(k+key) )
                result++;
            else if(k==0 && value>1)
                result++;
        }


        return result;
    }
}