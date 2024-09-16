// Time Complexity : O(n) n is the given array length
// Space Complexity :O(n) n is  given array length
// Any problem you faced while coding this :No
//hashing
// Your code here along with comments explaining your approach
package check;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Problem_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int k =1;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], i);
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int diff=arr[i]-k;
			if(map.containsKey(diff)) {
				count++;
			};
				
			
		}System.out.println(count);
		
	}
		
	}


