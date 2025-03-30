// Time Complexity : O(N) -> N is the number of elements in the array
// Space Complexity : O(N) --> Since we are usinh HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//We just use HashMap to check if there is any matching pair in the array
// Special case is to check when K == 0,
// because if we store that in HashMap its count will always be valid and can calulate that multiple times

class Solution {
    public int findPairs(int[] nums, int k) {

        HashMap<Integer, Integer> countFreq = new HashMap<>();
        int count = 0;

        for (int num: nums){ //Maintaing frequency which can later be used to check if there are other pairs
            countFreq.put(num, countFreq.getOrDefault(num, 0) + 1);
        }

        for(int num: countFreq.keySet()){ // We go over the Map instead of the array to avoid getting over the duplicates
            if(k == 0){ //Special case to avoid counting the complementary pair
                if(countFreq.get(num)>=2){
                    count++;
                }
            }else {
                if(countFreq.containsKey(num+k)){
                    count++;
                }
            }
        }
        return count;
    }
}



// Time Complexity : O(N^2) -> N is the numRows
// Space Complexity : O(1) -- we are just looping
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Used two for loops - 1 for goin over numRows and the other for calculating the summation of the lists - double index grabbing

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if(numRows == 0) return result;

        List<Integer>firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow); //Always adds [[1]] which is default for any case

        if(numRows == 1) return result;

        for(int i=1; i<numRows; i++){
            // -- stores references to prev entry so that we can use it to count it in inner for loop
            List<Integer> prevEntry = result.get(i-1); //[[1,1]]

            List<Integer> row = new ArrayList<>();
            row.add(1);//[1]

            for(int j = 1; j < i; j++ ){
                //double index grabbin - using prev ith and (i-1)th entry
                row.add(prevEntry.get(j) + prevEntry.get(j-1)); //calculating current lists sum from prev entry
            }

            row.add(1);//[1]
            result.add(row);//[[1], [1,1]]
        }
        return result;
    }

}