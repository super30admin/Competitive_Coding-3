//Approach- brute force approach, take one value and look through the map to find the difference that satisfy the diff-k answer. 
//TC- O(n^2)
//SC- O(1)

//Optimal approach -- 
//User Hashmap to store numbers as key and their count as values. 

class Solution {
    public int findPairs(int[] nums, int k) {

		//base case
		if(nums == null || nums.length ==0) return;
		
		//iterate over the array and put the key value in map as nums and count. 
		for(int i=0; i< nums.length; i++)
		{
			map.getOrDefault(map.get(nums[i],0)+1);
		}
		int count =0;
		forEach(int key : map.keySet())
		{
			int diff = key - k;
			
			if((k>0 && map.containsKey(diff)) || (k==0 && map.get(diff) >1)
				count++;
		}
		return count;

	}
}
