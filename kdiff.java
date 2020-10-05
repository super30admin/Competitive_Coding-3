//Time Compexity: O(n)
//Space Compexity: O(n)

//Approach:
//Main idea was to maintain a HashSet of possible [nums[i], nums[i+k]] list pair, which exist
//return size of HashSet as result, since set would maintain unique pairs, we sort num pair before putting in HashSet

//For the case of k==0, we handle it differently, maintain a HashMap with nums[i] with its count
//which soever have count>1, count as valid pair 

class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();
        HashSet<List<Integer>> result = new HashSet<List<Integer>>();
        
        for(int i=0; i<nums.length; i++){
            if(!values.containsKey(nums[i])){
                values.put(nums[i], 1);
            }
            else{
                values.put(nums[i], values.get(nums[i])+1);
            }
        }
        
        if(k==0){
            int count = 0;
            for(int n : values.keySet()){
                if(values.get(n)>1){
                    count++;
                }
            }
            return count;
        }
        
        for(int i=0; i<nums.length; i++){
            if(values.containsKey(nums[i]-k)){
                List<Integer> pair = Arrays.asList(nums[i], nums[i]-k);
                Collections.sort(pair);
                
                if(!result.contains(pair)){   
                    result.add(pair);    
                }
            }
            
            if(values.containsKey(nums[i]+k)){
                List<Integer> pair2 = Arrays.asList(nums[i], nums[i]+k);
                Collections.sort(pair2);
                
                if(!result.contains(pair2)){   
                    result.add(pair2);    
                }
            }
        }
        
        return result.size();
    }
}