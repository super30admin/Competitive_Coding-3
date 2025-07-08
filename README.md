# Competitive_Coding-3

Please submit the interview problems posted in slack channel here. The problems and statements are intentionally not shown here so that students are not able to see them in advance 

Problem 1: Pascals Triangle
// Time Complexity : O(numRows*numRows)
// Space Complexity : O(numRows*numRows)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
1. Declared a dp list of lists 
2. The current value is the sum of prev row current index + prev row i-1 index

class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0){
            return new ArrayList<>();
        }

        //dp list
        List<List<Integer>> dp = new ArrayList<>();

        //first element is 1
        List<Integer> list = new ArrayList<>();
        list.add(1);
        dp.add(list);

        for(int i = 1; i<numRows; i++){//i = 2
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            //to calculate the value run a loop to the current index
            for(int j = 1; j<i; j++){
                int value = dp.get(i-1).get(j-1) + dp.get(i-1).get(j); //to add the value from the prev list from ith-1 index and ith index
                temp.add(value); //add the calculated value
            }
            //there is always a 1 at the end
            temp.add(1);
            dp.add(temp); //add the current row in our dp list
        }

        return dp;
    }
}

2. K-Diff pairs
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
1. We will declare a hash map and store the elements in the nums array as key and their frequency as vaalue
2. We will run loop for all the keys present in the hashmap and put 2 conditions 
    i) If k == 0 that means we are looking for duplicates and increase the count if the frequency of that element if >=2
    ii) Else we will do key+k and if that sums value is present as a key in Hashmap then we will do count++
3. return count

class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (k == 0) {
                if (map.get(key) >= 2) count++;
            }
            else {
                if (map.containsKey(key + k)) count++;
            }
        }

        return count;
    }
}