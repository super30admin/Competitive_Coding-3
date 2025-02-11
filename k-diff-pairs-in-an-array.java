// Time Complexity : O(2n)=> O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : i achieved this problem by using hashmap to maintain the elements and corresponding frequency,
// in second loop i have calculate the each key from keyset with target to get compoliment then i have search for the compiment in the hashmap if it exist then i crement count here one case we should consider is if the target is 0 the compliment will become same key so at that point we need to check if only the frequency is greater than 1 then only increment the count by one.


// Your code here along with comments explaining your approach

class Solution {
 public int findPairs(int[] nums, int k) {
         HashMap<Integer, Integer> sMap = new HashMap<>();
        int n=nums.length;
         for (int i=0;i<n;i++) {
            if(!sMap.containsKey(nums[i])){
           sMap.put(nums[i],1);
            }else{
           sMap.put(nums[i],sMap.get(nums[i])+1);
            }
          }

        int count = 0;

  Set<Integer> newKeys = sMap.keySet();

         for (Integer i : newKeys) {
            int compliment = i - k;
           if (k == 0 && sMap.containsKey(i)) {
                if (sMap.get(i) > 1) {
                    count++;
                }
            } 
            else if (sMap.containsKey(compliment)) {
                count++;
            }
        }

        return count;
    }
}



class Solution {
    public int findPairs(int[] nums, int k) {
         HashMap<Integer, Integer> sMap = new HashMap<>();
        int n=nums.length;
         for (int i=0;i<n;i++) {
           sMap.put(nums[i], sMap.getOrDefault(nums[i], 0) + 1);
        }

        int count = 0;

Set<Integer> newKeys = sMap.keySet();

         for (Integer i : newKeys) {
            int compliment = i - k;
           if (k == 0 && sMap.containsKey(compliment)) {
                if (sMap.get(i) > 1) {
                    count++;
                }
            } 
            else if (sMap.containsKey(compliment)) {
                count++;
            }
        }

        return count;
    }
}