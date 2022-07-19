//Time complexity = O(n)
//Space complexity =O(n)
//intuit Interview
//Here we will be storing every element along with its index in the map. after that we will iterate over every element in the array and find the complement of that and then we will search whether that complement exists in the map or not if that exists we will compare the indices so as to make sure that the index of the current element and the complement is not same. after that we sort their indices and put them in a set so as to make sure that in future we are not getting the same pair of indices.
class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        HashSet<List<Integer>> result = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Integer complement1 = nums[i] - k;
            Integer complement2 = nums[i] - k;
            if(map.containsKey(complement1)){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(complement1);
                Collections.sort(temp);
                if(!result.contains(temp) && map.get(complement1)!=i){
                    result.add(temp);
                }
            }
            if(map.containsKey(complement1)){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(complement2);
                Collections.sort(temp);
                    if(!result.contains(temp) && map.get(complement2)!=i){
                        result.add(temp);
                    }
            }
         }
        return result.size();
        
    }
}