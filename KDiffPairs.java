package CompetitiveCoding3;

import java.util.HashMap;

public class KDiffPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,1,4,1,5};
		int k=2;
		int count = findPairs(nums,k);
		
		System.out.println(count);
	}

	private static int findPairs(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		if(nums == null || nums.length == 0) return 0;
		int count =0;
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for( int i : nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		for(int key : map.keySet()) {
			if(k==0) {
				if(map.get(key) >= 2) {
					count++;
				}
			}else {
				if(map.containsKey(key+k)) {
					count++;
				}
				
			}
		}
		
		
		return count;
	}

}
