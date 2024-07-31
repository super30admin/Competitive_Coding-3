// Time Complexity : O(numsRows^2) as we are applying for loop for number of rows and at the same time iterating over the previous list 
// which will be (current number - 1)
// Space Complexity : O(numRows) as maximum element at a time in currList will be numRows
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : nope


// Your code here along with comments explaining your approach
// First we will store [1] for numrows = 1 case and [1, 1] for numrows = 2 case. Then we will iterate for numrows-2 times as we already got the first 2 rows of
// our pascal triangle. Then we will get the previous list from result List and iterate over the previous list with 2 pointers. We will add the first and second
// element and store the result in new list and increment both the pointers. In this list we will store the first and last element as 1 as it will always be 1 in
// any case.
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> firstElementList = new ArrayList<>();
        firstElementList.add(1);
        result.add(firstElementList);

        if(numRows == 1) {
            return result;
        }

        List<Integer> secondElementList = new ArrayList<>();
        secondElementList.add(1);
        secondElementList.add(1);
        result.add(secondElementList);

        if(numRows == 2) {
            return result;
        }

        while(numRows-2 > 0) {

            int n = result.size();

            List<Integer> prevList = result.get(n-1);
            List<Integer> currentList = new ArrayList<Integer>();

            currentList.add(1);

            int p1 = 0;
            int p2 = 1;

            while(p2 < prevList.size()) {

                int sum = prevList.get(p1) + prevList.get(p2);
                currentList.add(sum);
                p1++;
                p2++;

            }

            currentList.add(1);

            result.add(currentList);

            numRows--;
            
        }

        return result;
    }
}



// Time Complexity : O(n) to add elements in the hashmap and to iterate over the original list again
// Space Complexity : O(n) as we are storing all the elements in the hashmap
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : nope


// Your code here along with comments explaining your approach
// Here first we will store unique index of each element. Then we will iterate over the given nums array. Now suppose the difference between current element and 
// k is already there in the hashmap that means there exists a pair in an array which has k difference. So, we will increase the count which we need to return 
// at the end and at the same time we will remove that diffrence from hashmap as well. So, we won't use same element again to make a different pair. For edge case
// such as if k = 0 we will check if we are not deleting the same element from itself we will check if given index i is not equal to the difference. 
class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            // if(!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            // }
        }

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i] - k) && i != map.get(nums[i] - k)) {
                map.remove(nums[i] - k);
                count = count + 1;
            }
        }

        return count;

    }
}


