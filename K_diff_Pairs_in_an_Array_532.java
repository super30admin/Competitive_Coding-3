
    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/paint-house/
    Time Complexity for operators : o(n)
    Extra Space Complexity for operators : o(n)...extra hashmap 
    Did this code successfully run on Leetcode : NA
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : Two for loops.
        # Optimized approach: . 
                              
            # 1. Form the Hashmap. Key will be the array values and value swill be the counter.
              2. Traverse thru hasmap and check if K == 0 if it is then need to check elements with values > 1. If found then increment counter.
              3. If k is not equal to 3 then check yake a complements (array element - k) and then check in hashmap
              4. If found then increment counter. return counter.
    */  
import java.util.*;
import java.util.Map.Entry;
public class K_diff_Pairs_in_an_Array_532 {
	
	public static int findDiff(int arr[],int k) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				int cnt =  hm.get(arr[i]);
				cnt += 1;
				hm.put(arr[i],cnt);
			}else
				hm.put(arr[i],1);
		}
		int counter = 0;
		for(Entry<Integer, Integer> ar: hm.entrySet()) {
			//System.out.println(ar);
			int key = ar.getKey();
			int value = ar.getValue();
			if(k==0 && value >1) {
				counter++;
			}else if(k!=0) {
				int comp = key - k;
				
				if(hm.containsKey(comp)) {
					counter++;
				}
			}
		}
		
		return counter;
	}
	
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5};
		int k = 1;
		int index = findDiff(arr,k);

        System.out.println("The element " + index);
	}
}


