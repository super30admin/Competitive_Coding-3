//Time complexity: O(n)
//Space complexity: O(n)
/Executed on leetcode.

class Solution {
    public int findPairs(int[] nums, int k) {
        int count =0;
		HashSet<Integer> set =new HashSet<>();
        HashSet<Integer> zeroSet =new HashSet<>();
		for(int i=0;i<nums.length;i++)	//3,5,6,4,5,1 - 1, 0 - 1
		{		
			if(k==0 && !zeroSet.contains(nums[i]) && set.contains(nums[i]))
            {
				count++;
                zeroSet.add(nums[i]);
            }
			else
			{
			if(set.contains(nums[i]-k) && !set.contains(nums[i])) //Checking if the elements with k difference already available in the set or not. if current number is not in set and the elements with k difference already available increment count.
			{
				count++;            //if k i 0 checking for duplicate values and using extra set not to count unique arrays
			}
			if(set.contains(nums[i]+k) && !set.contains(nums[i]))		//count = 3
				count++;
			}
			set.add(nums[i]);
		}
		
		return count;
    }
}