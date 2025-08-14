class kdiffpairs {
    //Idea is to use a Hashmap to store frequencies of each number and iterate 
    //over them to find the compliment. When k = 0, we check if frequency >=2 to include in final output
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public int findPairs(int[] nums, int k) {
       int count = 0; 
       HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
       for(int i=0;i<nums.length;i++)
       {
        if(hm.containsKey(nums[i]))
        {
            hm.put(nums[i], hm.get(nums[i])+1);
        }
        else
        {
            hm.put(nums[i], 1);
        }
       } 

       for(int num: hm.keySet())
       {
         int frq = hm.get(num);
         if(k==0)
         {
            if(frq>=2)
            {
                count++;
            }
         } 
         else
         {
            if(hm.containsKey(num-k)){
                count++;
            }
         }
       }

       return count;

    }
}