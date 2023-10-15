//Problem 1: Pascals Triangle
// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result= new ArrayList<>();
        result.add(Arrays.asList(1)); // add first level

        for(int i=1;i<numRows;i++){
            List<Integer> cur= new ArrayList<>(); //currentlist
            cur.add(1); // add initial 1
            for(int j=1;j<result.get(i-1).size();j++) //taking i-1 because thats previous row
                cur.add(result.get(i-1).get(j-1)+result.get(i-1).get(j)); //add element above it and previous above it. 
            cur.add(1); //add final 1

            result.add(cur);
        }
        return result;
    }
}

//PROBLEM 2:  Unique Pairs difference is k
// Time Complexity : O(n)
// Space Complexity : O(n) //hashmap
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {
        int result = 0;

        HashMap <Integer,Integer> counter = new HashMap<>();
        for (int n: nums) {
            counter.put(n, counter.getOrDefault(n, 0)+1); // add element and and its frequency
        }


        for (Map.Entry <Integer, Integer> entry: counter.entrySet()) {
            int x = entry.getKey();
            int val = entry.getValue();
            if (k > 0 && counter.containsKey(x + k)) { // if compliment consists, add to result
                result++; 
            } else if (k == 0 && val > 1) { // if k==0 and any value is more than once, that means it can cancel itself and form a pair, number of val doesnt matter because we want UNIQUE pairs
                result++;
            }
        }
        return result;
    }
}