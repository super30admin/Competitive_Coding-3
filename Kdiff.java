
// Time Complexity :O(n)
// Space Complexity :O(n)


public class Kdiff {
    public int findPairs(int[] nums, int k) {
        
        Map <Integer,Integer> map = new HashMap<Integer,Integer>();
        int count = 0;
        for (Integer n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        
        for (Integer key : map.keySet()){
        if(k==0 && map.get(key)>1)
        count++;
        else if(k>0 && map.containsKey(key+k)) count++;
        }
    return count;
    }
}
