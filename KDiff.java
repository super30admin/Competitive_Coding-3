/*TC - O (N)
 *SC - O (2N)
 Ran on leetcode - yes
 * */

// Approach 1  - maintain a hasmap of elements and its frequencies, in second pass, check if the num+diff is present , if yes, mark it as visited using a hashset and incremernt the count
class Solution {
    public int findPairs(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        //populate the hm with the elements vs frequency of elements 
        
        for (int i = 0 ; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }
        }
        
        // for k = 0 
        if (k == 0) {
            for (Map.Entry<Integer,Integer> entry:map.entrySet()){
                if (entry.getValue() > 1){
                    count += 1;
                }
            } 
            return count;
        }
       
	//System.out.println(map);
        Set<Integer> set = new HashSet<>();
        for (int i = 0 ; i < nums.length; i++){
            if (map.containsKey(nums[i]+k) && !set.contains(nums[i])){
                    count +=1;
      	            set.add(nums[i]);        
            } 
            
        }
        
        return count;
        
    }
}

/*TC - O (N), SC- O (N), Ran on leetcode
 * */

// Approach 2  - maintain a hasmap of elements and its frequencies, in second pass, check if the num+diff is present , if yes, mark it as visited in the same hashmap with value as -1 iand incremernt the count
class Solution {
    public int findPairs(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        //populate the hm with the elements vs frequency of elements 
        
        for (int i = 0 ; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }
        }
        
        // for k = 0 
        if (k == 0) {
            for (Map.Entry<Integer,Integer> entry:map.entrySet()){
                if (entry.getValue() > 1){
                    count += 1;
                }
            } 
            return count;
        }
       
        for (int i = 0 ; i < nums.length; i++){
            if (map.containsKey(nums[i]+k) && map.get(nums[i]) > 0 ){
                    count +=1;
                   map.put(nums[i], -1); 
            } 
            
        }
        
        return count;
        
    }
}
