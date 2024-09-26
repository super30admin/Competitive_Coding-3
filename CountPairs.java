// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope


// Your code here along with comments explaining your approach
// Create a set to keep a track of all the numbers
// for every number, x, in the set, check if the set contians (x+k) and (x-k) and increment the counter accordingly
// return the result as counter/2 since the counter will have twice the value of the pairs.
// K = 0, is a special case where we have to keep a count of every element and consider only those elements that appear more than once
class Solution {
    public int findPairs(int[] arr, int k) {
        if(arr == null || arr.length == 0)
            return 0;
        
        int result = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
            count.put(arr[i], count.getOrDefault(arr[i],0)+1);
            
        }
        
        for(int i: set) {
            if(k==0) {
                if(count.get(i) > 1) {
                    result += 2;
                }
            }
            else {
                    int n1 = i + k;
                    int n2 = i - k;
                    if(set.contains(n1))
                        result++;
                    if(set.contains(n2))
                        result++;
            }
        }
        
        return result/2;
    }
}