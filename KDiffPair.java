// TC: O(n) where n represents the number of elements in the array
// SC: O(n) since we are using Hashmap to store values

// We are storing the number in the Map, We are running the loop once again considering the Key values of the map, We will add the key value with k and check
// if the sum of val and k is already present in the map. If it is present, increment the count. If the value of k is 0, then we will check if the same number is repeated more than once
// if the same number is repeated, 

import java.util.HashMap;

public class KDiffPair {
	
	public int KDiff(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int cnt =0;

		for(int num: nums) {
			map.put(num, map.getOrDefault(num, 0)+1 );
		}
		
		for(int val: map.keySet()) {
			if(k>0 &&map.containsKey(val+k) || (k==0 && map.get(val)>1))
				cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		
		KDiffPair kd = new KDiffPair();
		int[] nums = {3, 1, 4, 1, 5};
		System.out.println(kd.KDiff(nums, 2));
	}
}
