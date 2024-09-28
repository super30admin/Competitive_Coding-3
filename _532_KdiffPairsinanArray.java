package com.javadwarf.hashtable.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _532_KdiffPairsinanArray {

	public static void main(String[] args) {
		int[] arr = {6,3,5,7,2,3,3,8,2,4};
		System.out.println(findPairs(arr, 2));
	}
	
	// Hashing approach
	// time and Space o(n)
	public static int findPairs(int[] nums, int k) {

		Set<List<Integer>> set = new HashSet<>();

		Map<Integer, Integer> map = new HashMap<>();

		for(int i=0; i<nums.length; i++){

			if(map.containsKey(nums[i]-k) ){
				int index = map.get(nums[i]-k);
				if(index != i){
					List<Integer> temp = Arrays.asList(nums[i]-k,nums[i]);
					if(!set.contains(temp)){
						set.add(temp);        
					}
				}
			}
			 if(map.containsKey(nums[i]+k) ) {
				int index = map.get(nums[i]+k);
				if(index != i) {
					List<Integer> temp = Arrays.asList(nums[i], nums[i]+k);
					if(!set.contains(temp)){
						set.add(temp);
					}
				}
			}
			map.put(nums[i], i);
		}
		return set.size();


	}
}
