// 118. Pascal's Triangle
// https://leetcode.com/problems/pascals-triangle/description/

/**
 * Time Complexity: O(n * m) ~ O(n^2) since we iterate over each element
 * Space Complexity: O(1) since no auxillary space as we dont consider result 
 */



class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0 ; i < numRows ; i++){

            List<Integer> currList = new ArrayList<>();

            for(int j = 0 ; j <= i ; j++){

                if(j == 0 || j == i){
                    currList.add(1);
                }else{
                    List<Integer> prevList = result.get(i - 1);

                    int currNumber = prevList.get(j - 1) + prevList.get(j);

                    currList.add(currNumber);
                }
            }

            result.add(currList);
        }

        return result;
    }
}