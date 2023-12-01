//change of branch name for a new PR test

public class Solution {
    public int FindPairs(int[] nums, int k) {
		//base case
		if(nums == null || k <0) return -1;
		
		Dictionary<int, int>dict = new Dictionary<int,int>();
		
		
		//build dictionary with Key and Values
		
		foreach(int n in nums)
		{
			dict.TryGetValue(n, out int count);
			dict[n] = count+1;
		}
		
		int cnt=0;
		foreach(int key in dict.Keys)
		{
			//if k==0 i.e. we need the same number occuring more than 1 time!
			if(k == 0 && dict[key] >1) cnt++;
			int diff = key - k;

			//look for difference in the dctionary if that exist means we found a pair!
			
			if(k >0 && dict.ContainsKey(key - k)) cnt++; 
		}
		return cnt;
	}
}