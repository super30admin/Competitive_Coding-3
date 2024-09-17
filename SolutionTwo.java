// Time complexity: O(n)
// Space complexity: O(n)
class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<String> pairs = new HashSet<>();
        HashSet<Integer> visited = new HashSet<>();
        if(k < 0) return 0;
        
        for(int num: nums){     
            if(visited.contains(num - k)){
                pairs.add((num - k) + ":" + num);
            }
            if(visited.contains(num + k)){
                pairs.add(num + ":" + (num + k));
            }
            visited.add(num);
        }
        
        return pairs.size();
    }
}
