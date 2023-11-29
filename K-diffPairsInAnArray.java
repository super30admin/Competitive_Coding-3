//  Time Complexity: O(n)
//  Space Complexity: O(2n)
class Solution {
    public int findPairs(int[] nums, int k) {

        if(nums == null || nums.length == 0) return 0;
        Map<Integer, Set<Integer>> map = new HashMap<>();
        int count = 0;

        map.put(nums[0], new HashSet<>());
        for(int i=1; i<nums.length; i++){
            int add = nums[i] + k;
            int diff = nums[i] - k;


            if(map.containsKey(add)){
                if(!map.get(add).contains(nums[i])){
                    map.get(add).add(nums[i]);
                    if(!map.containsKey(nums[i])){
                        map.put(nums[i], new HashSet<>());
                    }
                    map.get(nums[i]).add(add);
                    count++;
                }              
            }

            if(map.containsKey(diff)){
                if(!map.get(diff).contains(nums[i])){
                    map.get(diff).add(nums[i]);
                    if(!map.containsKey(nums[i])){
                        map.put(nums[i], new HashSet<>());
                    }
                    map.get(nums[i]).add(diff);
                    count++;
                }              
            }


            if(!map.containsKey(nums[i])){
                map.put(nums[i], new HashSet<>());
            }
            
        }
        return count;
        
    }
}