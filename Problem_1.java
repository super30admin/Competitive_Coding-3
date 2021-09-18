// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// setup the hashmap, and find the diff by finding the k+nums[i] and also check for if the value is not at the same index
// Three line explanation of solution in plain english

class Solution {
    public int findPairs(int[] nums, int k) {
        if( nums == null || nums.length == 0) return 0;
        if(k < 0) return 0;
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++) {
            mp.put(nums[i],i);
        }
        int count=0;
        for(int i=0;i<nums.length;i++) {
            if(mp.containsKey(k+nums[i]) && mp.get(k+nums[i])!=i) {
                count++;
                mp.remove(k+nums[i]);
            }
        }
        return count;
    }
}

// class Solution {
//     public int findPairs(int[] nums, int k) {
//         int count = 0;
//         if( nums == null || nums.length == 0) return count;
//         HashSet<Integer> hs = new HashSet<>();
//         HashSet<Integer> hasValue = new HashSet<>();
//         for(int i = 0; i < nums.length; i++){
//             //System.out.println("Num value "+nums[i]);
//             if(hs.contains(nums[i])){
//                 if(!hasValue.contains(nums[i])){
//                     hasValue.add(nums[i]);
//                     if( nums[i] != nums[i] - k){
//                        hasValue.add(nums[i] - k);
//                     }else{
//                        hasValue.add(nums[i] + k);
//                     }
//                     hs.remove(nums[i]);
//                     count++;
//                 }
//             }
//             hs.add(nums[i] + k);
//             hs.add(nums[i] - k);
//         }
//         return count;
//     }
// }