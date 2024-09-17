//Using hashmap to store the count of each element - https://www.youtube.com/watch?v=S1HZpd8Jhyw&ab_channel=NareshGupta
//TC:O(N)
//SC:O(N)
//Did it run successfully on Leetcode?:Yes
class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        HashMap<Integer, Integer> countMap = new HashMap();
        for (int num : nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        for (int x: countMap.keySet()){
            if ((k > 0 && countMap.containsKey(x+k)) || (k == 0 && countMap.get(x) > 1))
                result++;
        }
        return result;
    }
}
