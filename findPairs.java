// Time Complexity: O(n log (n))
// Space Compelxity: O(n)=> for sorting.
// Leetcode: 532. K-diff Pairs in an Array (Medium)
class Solution {
    public int findPairs(int[] nums, int k) {
        
        if(nums==null || nums.length<=1)
            return 0;
        // this takes O(nlog) time complexity.Java 8 uses Dual pivot quick sort              
        Arrays.sort(nums);
        int count=0, lt=0, rt=1, diff=0, n=nums.length;
        
        // we are iterating through the array once=> Time complexity: O(n)
        while( rt< n && lt< rt)
        {
            diff=nums[rt]-nums[lt];
            if(diff==k)
            {
                count++;
                lt++;
                rt++;
                // To skip same nums[lt]
                while(lt< n && nums[lt-1]==nums[lt]  )
                {
                    lt++;
                }
                // To skip same nums[rt]
                while(rt < n && nums[rt-1]==nums[rt])
                {
                    rt++;
                }
                // To make sure lt and rt are not same and lt<rt
                if(lt>=rt)
                {
                    rt=lt+1;
                }
               
            }
            // We are moving away from the k hence we increase the lt pointer
            else if(diff> k)
            {
                lt++;
                // Since we are incrementing lt pointer alone there is a possibility that lt==rt. In that case we set rt=lt+1
                if(lt==rt)
                    rt++;
            }
            else //(diff< k)
            {
                rt++;
            }
        }
        return count;
        
    }
}