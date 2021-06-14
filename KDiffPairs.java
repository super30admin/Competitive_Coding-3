// Time Complexity : O(N)
// Space Complexity : O(N) //hash map size 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/**
 * 1. In a map put element and its count.
 * 2. for each element find n+k exist or not. if exist increment counter by 1.
 * 3. For special case 0 find element count is more than 1 increment counter by 1
 */

import java.util.HashMap;
import java.util.Map;

public class KDiffPairs {

	public int findPairs(int[] nums, int k) {
		
		Map<Integer,Integer> map= new HashMap<>();
		for (int i:nums) {
			map.put(i,map.getOrDefault(i, 0)+1);
		}
		
		int counter = 0;
		for(int i:map.keySet()) {
			if(k==0 && map.get(i)>1) {
				counter++;
			}
			else if(k>0 && map.containsKey(i+k)) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		int[] nums= new int[] {3,1,4,1,5};
		System.out.println(new KDiffPairs().findPairs(nums, 2));
	}
}
