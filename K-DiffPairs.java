//TC: SC : O(n)

class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0) return 0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1); //frequency
        }

        for(int num : map.keySet()){
            if(k==0){
                if(map.get(num)>1) count++;
            }else{
                if(map.containsKey(num+k)) count++;
            }

        }
        return count;
    }
}