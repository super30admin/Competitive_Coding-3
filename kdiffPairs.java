//532. K-diff Pairs in an Array
//Time Complexity : O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

//Your code here along with comments explaining your approach
/*Step 1: we will first check boundary case that is if k <2 or nums array is empty then we will return 0.
 * Step 2: We will now add elements with there frequency in HashMap. This will take O(n) space. If we we counter same element again then increase the frequency by 1.
 * Step 3: Now iterate through HashMap, and adding K to key and if the resultant number is present as key in HashMap. Then we will increment the count.
 * Step 4: Return count
 */

/*output: 4 */

import java.util.*;
public class kdiffPairs {

	public static int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)   return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                //count how many elements in the array that appear more than twice.
                if (entry.getValue() >= 2) {
                    count++;
                } 
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,2,3,4,5}; int k=1;
		
		int result=findPairs(num, k);
		System.out.println(result);

	}

}
