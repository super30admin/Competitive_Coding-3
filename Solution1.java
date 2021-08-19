class Solution1  {
    public int findPairs(int[] nums, int k) {

        int count =0;
        //[2,2,2] 
        Map<Integer,Integer> map = new HashMap();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> map2: map.entrySet())
        {
            int key= map2.getKey();
            int value = map2.getValue();


            if(k==0)
            {
                if(map2.getValue()>1)
                {
                    count++;
                }
            }
            else 
            {
                if(map.containsKey(key-k))
                {
                    count++;
                }
            }


        }

         return count;
    }
}