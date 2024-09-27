import java.util.HashMap;
/**
 * Time: O(n)
 * Space: O(n)
 * Leetcode accepted: yes
 * Problems faced: No
 */
public class UniqueKdiff {

	private static int uniqueKdiff(int[] nums, int k) {
		if(k < 0) return 0;
		int count = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		// HashMap => element - count
		for(int i=0; i<nums.length; i++) {
			if(!hm.containsKey(nums[i])) {
				hm.put(nums[i], 1);
			} else {
				hm.put(nums[i], hm.get(nums[i])+1);
			}
		}
	
		if(k == 0) {
			//If an element is repeated at least twice, increment count
			for(int key: hm.keySet()) {
				if(hm.get(key) > 1) {
					count++;
				}
			}
		} else {
			//If corresponding element exists in HashMap, increment count
			for(int key: hm.keySet()) {
				if(hm.containsKey(key+k)) {
					count++;
				}
			}
			
		}
		return count;
	}
	public static void main(String[] args) {
		int[] nums = {3, 1, 4, 1, 5};
		System.out.println(uniqueKdiff(nums, 2));
	}

}
