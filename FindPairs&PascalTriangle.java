package Super30;

import java.util.*;
//

public class FindPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,5,1,1};
		System.out.println(findPairs(nums, 0));
		pascalsTriangle(3);

	}

	//T: O(n)
	//S: O(n)
	
	public static int findPairs(int[] nums, int target) {
		//null check
		if(nums == null)
			return 0;
		
		//create map
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		System.out.println(map);
		
		int count = 0;
		
		for(Map.Entry<Integer, Integer>  entry : map.entrySet()) {
			int key = entry.getKey();
			int val = entry.getValue();
			
			if(target == 0 && val > 1)
				count += 1;
			
			else if(target > 0){
				int num2 = key + target;
				if(map.containsKey(num2))
					count++;
			}
			
		}
		return count;
	}
	

	//T : O(n2)
	//S : O(1)
	public static List<List<Integer>> pascalsTriangle(int rows){
		List<List<Integer>> t = new ArrayList<List<Integer>>();
		if(rows == 0)
			return t;
		
		List<Integer> row1 = new ArrayList<Integer>();
		row1.add(1);
		t.add(row1);
		
		for(int i = 1; i < rows; i++) {
			//add def
			List<Integer> row = new ArrayList<Integer>();
			row.add(1);
			
			//get prev
			List<Integer> prevR = t.get(i -1);
			
			for(int j = 1; j < i; j++) {
				row.add(prevR.get(j-1) + prevR.get(j));
			}
			
			
			//add last 1
			row.add(1);
			t.add(row);
		}
		
		System.out.println(t);
		return t;
	}

}
