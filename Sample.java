// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


//k diff
//TIME COMPLEXITY:O(N)
//SPACE COMPLEXITY:O(N)
class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> s = new HashMap<Integer, Integer>();
        int count=0;
        if (nums.length == 1) {

        }
        for (int i=0;i<nums.length;i++) {
            s.put(nums[i], i);
        }
        System.out.println(s);

        for (int i=0;i<nums.length;i++) {
            if (s.containsKey(nums[i]+k) && i != s.get(nums[i]+k)) {
                count++;
                s.remove(nums[i]+k);
                System.out.println(count);
            }
        }
        return count;
    }
}

//PASCAL TRIANGLE
//TIME COMPLEXITY:O(N^2)
//space complexity:O(N)
class Solution {
    public List<List<Integer>> generate(int numRows) {

        List temp = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<>();
        temp.add(1);
        
        if (numRows == 1) {
            // numRows = 1
            result.add(temp);
            return result;
        }
        
        result.add(temp);
        // numRows >= 2
        for (int i=1; i<numRows;i++) {
            temp = new ArrayList<Integer>();
            // first of every list/
            temp.add(1);
            for (int j=1;j<i;j++) {
                temp.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            temp.add(1);
            result.add(temp);
            
        }
            
       return result;

    }
}
