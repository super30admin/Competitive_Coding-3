//T.C- O(N)- O(N)- to create freq hmap + O(N)- to traverse the keys of that hashmap so O(2N)~ 2N
//S.C- O(N)- storing the frequency of each unique number in the array
import java.util.HashMap;
class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums==null || nums.length==0){
            return 0;
        }
        HashMap<Integer,Integer> map= new HashMap<>();
        int count=0;
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1); //number: frequency of its occurrence 
        }
        
        for(int p: map.keySet()){
            if(k>0){
                int comp= k+p;  //like complement
                if(map.containsKey(comp)){
                    count++;
                }
            }else if(map.get(p)>1){
                count++;
            }
            
        }
        return count;
    }
}


