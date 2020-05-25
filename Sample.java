// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
public int findPairs(int[] nums, int k) {
        if(k<0)return 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],2);
            }else{
                map.put(nums[i],1);
            }
        }
        int count = 0;
        if(k==0){
            for(int i = 0; i<nums.length; i++){
                if(map.containsKey(nums[i]) && map.get(nums[i]) > 1){
                    count++;
                    map.replace(nums[i],0);
                }
            }
            return count;
        }
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i] + k) && map.get(nums[i] + k) > 0 && map.get(nums[i]) > 0){
                count++;
            }
            if(map.containsKey(nums[i] - k) && map.get(nums[i] - k) > 0 && map.get(nums[i]) > 0){
                count++;
            }
            map.replace(nums[i],0);
        }
        return count;
    }

-----------------------------------------------------------------------------------
// Time Complexity : O(n!);
// Space Complexity : O(n!); 
// Did this code successfully run on Leetcode : Yes

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
        
    	List<List<Integer>> result = new ArrayList<>();
        
        //edge
        if(numRows == 0)
            return result;
            
        for(int i = 0; i <= numRows-1; i++) {
			List<Integer> rowArray = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
				
				
				if(j == 0 || j == i)
                    rowArray.add(1);
                else {
					
                    int left = result.get(i-1).get(j-1);
                    int right = result.get(i-1).get(j);
                    rowArray.add(left + right);
                }    
            }
            result.add(rowArray);
        }
        return result;
	}
}